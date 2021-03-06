/*******************************************************************************
 * This file is part of the Twig eclipse plugin.
 * 
 * (c) Robert Gruendler <r.gruendler@gmail.com>
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 ******************************************************************************/
package com.dubture.twig.ui.editor.autoEdit;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocument;

import com.dubture.twig.core.log.Logger;


@SuppressWarnings("restriction")
public class CurlyOpenAutoEditStrategy extends IndentLineAutoEditStrategy
		implements IAutoEditStrategy {
	
	public void customizeDocumentCommand(IDocument document,
			DocumentCommand command) {
		if (command.text != null && command.text.endsWith("{")) { //$NON-NLS-1$
			autoIndentBeforeCurlyOpen((IStructuredDocument) document, command);
		}
	}

	private StringBuffer helpBuffer = new StringBuffer();

	private void autoIndentBeforeCurlyOpen(IStructuredDocument document,
			DocumentCommand command) {

		int startOffset = command.offset;
		int endOffset = startOffset + command.length;
		helpBuffer.setLength(0);
		try {
			IRegion startlineInfo = document
					.getLineInformationOfOffset(startOffset);
			IRegion endlineInfo = null;

			if (startlineInfo.getOffset() + startlineInfo.getLength() < endOffset) {
				// meaning the begin and the end of the selection is not in the
				// same line.
				endlineInfo = document.getLineInformationOfOffset(endOffset);
			} else {
				endlineInfo = startlineInfo;
			}
			int lineNumber = document.getLineOfOffset(startOffset);

			if (isBlanks(document, startlineInfo.getOffset(), endlineInfo
					.getOffset()
					+ endlineInfo.getLength(), startOffset)) {
				placeMatchingBlanks(document, helpBuffer, lineNumber,
						startOffset);
				int endSelection = command.offset + command.length;
				command.offset = startlineInfo.getOffset();
				command.length = (command.length == 0) ? endOffset
						- command.offset : endSelection - command.offset;
			}
		} catch (BadLocationException e) {
			Logger.logException(e);
		}

		command.text = helpBuffer.toString() + command.text;

	}	

}
