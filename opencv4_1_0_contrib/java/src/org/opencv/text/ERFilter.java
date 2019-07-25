//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.text;

import org.opencv.core.Algorithm;

// C++: class ERFilter
//javadoc: ERFilter

public class ERFilter extends Algorithm {

    protected ERFilter(long addr) { super(addr); }

    // internal usage only
    public static ERFilter __fromPtr__(long addr) { return new ERFilter(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
