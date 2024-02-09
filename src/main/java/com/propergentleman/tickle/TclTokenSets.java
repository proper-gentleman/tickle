package com.propergentleman.tickle;

import com.intellij.psi.tree.TokenSet;
import com.propergentleman.tickle.psi.TclTypes;

public interface TclTokenSets {
    TokenSet IDENTIFIERS = TokenSet.create(TclTypes.KEY);

    TokenSet COMMENTS = TokenSet.create(TclTypes.COMMENT);
}
