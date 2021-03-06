/*******************************************************************************
 * This file is part of the Twig eclipse plugin.
 * 
 * (c) Robert Gruendler <r.gruendler@gmail.com>
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 ******************************************************************************/
package com.dubture.twig.core.codeassist.strategies;

import org.eclipse.dltk.internal.core.SourceRange;
import org.eclipse.php.core.codeassist.ICompletionContext;
import org.eclipse.php.internal.core.codeassist.CodeAssistUtils;
import org.eclipse.php.internal.core.codeassist.ICompletionReporter;
import org.eclipse.php.internal.core.codeassist.strategies.AbstractCompletionStrategy;

import com.dubture.twig.core.codeassist.context.FunctionContext;
import com.dubture.twig.core.log.Logger;
import com.dubture.twig.core.model.Function;
import com.dubture.twig.core.model.TwigModelAccess;

/**
 * 
 * 
 * 
 * 
 * @author Robert Gruendler <r.gruendler@gmail.com>
 *
 */
@SuppressWarnings({ "restriction", "deprecation" })
public class FunctionStrategy extends AbstractCompletionStrategy {

	public FunctionStrategy(ICompletionContext context) {
		super(context);

	}

	@Override
	public void apply(ICompletionReporter reporter) throws Exception {

		try {

			FunctionContext ctx = (FunctionContext) getContext();
			TwigModelAccess model = TwigModelAccess.getDefault();
			
			String prefix = ctx.getPrefix();
			SourceRange range = getReplacementRange(getContext());
			
			Function[] functions = model.getFunctions(ctx.getSourceModule().getScriptProject());
				
			for (Function function : functions) {				
				if (CodeAssistUtils.startsWithIgnoreCase(function.getElementName(), prefix)) {					
			
					function.setScriptProject(ctx.getSourceModule().getScriptProject());

					reporter.reportType(function, "()", range);					
				}
			}
			
		} catch (Exception e) {
			Logger.logException(e);
		}			
	}
}
