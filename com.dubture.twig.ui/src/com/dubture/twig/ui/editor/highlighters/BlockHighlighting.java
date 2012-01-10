/*
 * This file is part of the Twig eclipse plugin.
 *
 * (c) Robert Gruendler <r.gruendler@gmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */
package com.dubture.twig.ui.editor.highlighters;

import com.dubture.twig.core.parser.ast.node.BlockName;
import com.dubture.twig.ui.editor.highlighter.AbstractSemanticApply;
import com.dubture.twig.ui.editor.highlighter.AbstractSemanticHighlighting;

public class BlockHighlighting extends AbstractSemanticHighlighting
{
    protected class BlockApply extends AbstractSemanticApply {
        
        @Override
        public boolean visit(BlockName block) throws Exception
        {
            highlight(block);
            return false;
        }
    }

    @Override
    public AbstractSemanticApply getSemanticApply()
    {
        return new BlockApply();
    }

    @Override
    public void initDefaultPreferences()
    {
        
    }

    @Override
    public String getDisplayName()
    {
        return "Blocks";
    }
}
