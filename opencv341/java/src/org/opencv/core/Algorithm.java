//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.core;

// C++: class Algorithm
//javadoc: Algorithm

public class Algorithm {

    protected final long nativeObj;
    protected Algorithm(long addr) { nativeObj = addr; }

    // internal usage only
    public static Algorithm __fromPtr__(long addr) { return new Algorithm(addr); }

    // C++:  String getDefaultName()
    private static native String getDefaultName_0(long nativeObj);

    //
    // C++:  String getDefaultName()
    //

    // C++:  bool empty()
    private static native boolean empty_0(long nativeObj);


    //
    // C++:  bool empty()
    //

    // C++:  void clear()
    private static native void clear_0(long nativeObj);


    //
    // C++:  void clear()
    //

    // C++:  void save(String filename)
    private static native void save_0(long nativeObj, String filename);


    //
    // C++:  void read(FileNode fn)
    //

    // Unknown type 'FileNode' (I), skipping the function


    //
    // C++:  void save(String filename)
    //

    // native support for java finalize()
    private static native void delete(long nativeObj);


    //
    // C++:  void write(Ptr_FileStorage fs, String name = String())
    //

    // Unknown type 'Ptr_FileStorage' (I), skipping the function

    public long getNativeObjAddr() { return nativeObj; }

    //javadoc: Algorithm::getDefaultName()
    public  String getDefaultName()
    {

        String retVal = getDefaultName_0(nativeObj);

        return retVal;
    }

    //javadoc: Algorithm::empty()
    public  boolean empty()
    {

        boolean retVal = empty_0(nativeObj);

        return retVal;
    }

    //javadoc: Algorithm::clear()
    public  void clear()
    {

        clear_0(nativeObj);

        return;
    }

    //javadoc: Algorithm::save(filename)
    public  void save(String filename)
    {

        save_0(nativeObj, filename);

        return;
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
