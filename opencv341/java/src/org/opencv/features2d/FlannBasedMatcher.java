//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;

// C++: class FlannBasedMatcher
//javadoc: FlannBasedMatcher

public class FlannBasedMatcher extends DescriptorMatcher {

    protected FlannBasedMatcher(long addr) { super(addr); }

    //javadoc: FlannBasedMatcher::FlannBasedMatcher()
    public   FlannBasedMatcher()
    {

        super( FlannBasedMatcher_0() );

        return;
    }

    //
    // C++:   FlannBasedMatcher(Ptr_flann_IndexParams indexParams = makePtr<flann::KDTreeIndexParams>(), Ptr_flann_SearchParams searchParams = makePtr<flann::SearchParams>())
    //

    // internal usage only
    public static FlannBasedMatcher __fromPtr__(long addr) { return new FlannBasedMatcher(addr); }


    //
    // C++: static Ptr_FlannBasedMatcher create()
    //

    //javadoc: FlannBasedMatcher::create()
    public static FlannBasedMatcher create()
    {
        
        FlannBasedMatcher retVal = FlannBasedMatcher.__fromPtr__(create_0());
        
        return retVal;
    }

    // C++:   FlannBasedMatcher(Ptr_flann_IndexParams indexParams = makePtr<flann::KDTreeIndexParams>(), Ptr_flann_SearchParams searchParams = makePtr<flann::SearchParams>())
    private static native long FlannBasedMatcher_0();

    // C++: static Ptr_FlannBasedMatcher create()
    private static native long create_0();

    // native support for java finalize()
    private static native void delete(long nativeObj);

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
