//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;

// C++: class AKAZE
//javadoc: AKAZE

public class AKAZE extends Feature2D {

    public static final int
            DESCRIPTOR_KAZE_UPRIGHT = 2,
            DESCRIPTOR_KAZE = 3,
            DESCRIPTOR_MLDB_UPRIGHT = 4,
            DESCRIPTOR_MLDB = 5;

    protected AKAZE(long addr) { super(addr); }

    // internal usage only
    public static AKAZE __fromPtr__(long addr) { return new AKAZE(addr); }


    //
    // C++: static Ptr_AKAZE create(int descriptor_type = AKAZE::DESCRIPTOR_MLDB, int descriptor_size = 0, int descriptor_channels = 3, float threshold = 0.001f, int nOctaves = 4, int nOctaveLayers = 4, int diffusivity = KAZE::DIFF_PM_G2)
    //

    //javadoc: AKAZE::create(descriptor_type, descriptor_size, descriptor_channels, threshold, nOctaves, nOctaveLayers, diffusivity)
    public static AKAZE create(int descriptor_type, int descriptor_size, int descriptor_channels, float threshold, int nOctaves, int nOctaveLayers, int diffusivity)
    {
        
        AKAZE retVal = AKAZE.__fromPtr__(create_0(descriptor_type, descriptor_size, descriptor_channels, threshold, nOctaves, nOctaveLayers, diffusivity));
        
        return retVal;
    }

    //javadoc: AKAZE::create()
    public static AKAZE create()
    {
        
        AKAZE retVal = AKAZE.__fromPtr__(create_1());
        
        return retVal;
    }


    //
    // C++:  String getDefaultName()
    //

    // C++: static Ptr_AKAZE create(int descriptor_type = AKAZE::DESCRIPTOR_MLDB, int descriptor_size = 0, int descriptor_channels = 3, float threshold = 0.001f, int nOctaves = 4, int nOctaveLayers = 4, int diffusivity = KAZE::DIFF_PM_G2)
    private static native long create_0(int descriptor_type, int descriptor_size, int descriptor_channels, float threshold, int nOctaves, int nOctaveLayers, int diffusivity);


    //
    // C++:  double getThreshold()
    //

    private static native long create_1();


    //
    // C++:  int getDescriptorChannels()
    //

    // C++:  String getDefaultName()
    private static native String getDefaultName_0(long nativeObj);


    //
    // C++:  int getDescriptorSize()
    //

    // C++:  double getThreshold()
    private static native double getThreshold_0(long nativeObj);


    //
    // C++:  int getDescriptorType()
    //

    // C++:  int getDescriptorChannels()
    private static native int getDescriptorChannels_0(long nativeObj);


    //
    // C++:  int getDiffusivity()
    //

    // C++:  int getDescriptorSize()
    private static native int getDescriptorSize_0(long nativeObj);


    //
    // C++:  int getNOctaveLayers()
    //

    // C++:  int getDescriptorType()
    private static native int getDescriptorType_0(long nativeObj);


    //
    // C++:  int getNOctaves()
    //

    // C++:  int getDiffusivity()
    private static native int getDiffusivity_0(long nativeObj);


    //
    // C++:  void setDescriptorChannels(int dch)
    //

    // C++:  int getNOctaveLayers()
    private static native int getNOctaveLayers_0(long nativeObj);


    //
    // C++:  void setDescriptorSize(int dsize)
    //

    // C++:  int getNOctaves()
    private static native int getNOctaves_0(long nativeObj);


    //
    // C++:  void setDescriptorType(int dtype)
    //

    // C++:  void setDescriptorChannels(int dch)
    private static native void setDescriptorChannels_0(long nativeObj, int dch);


    //
    // C++:  void setDiffusivity(int diff)
    //

    // C++:  void setDescriptorSize(int dsize)
    private static native void setDescriptorSize_0(long nativeObj, int dsize);


    //
    // C++:  void setNOctaveLayers(int octaveLayers)
    //

    // C++:  void setDescriptorType(int dtype)
    private static native void setDescriptorType_0(long nativeObj, int dtype);


    //
    // C++:  void setNOctaves(int octaves)
    //

    // C++:  void setDiffusivity(int diff)
    private static native void setDiffusivity_0(long nativeObj, int diff);


    //
    // C++:  void setThreshold(double threshold)
    //

    // C++:  void setNOctaveLayers(int octaveLayers)
    private static native void setNOctaveLayers_0(long nativeObj, int octaveLayers);

    // C++:  void setNOctaves(int octaves)
    private static native void setNOctaves_0(long nativeObj, int octaves);

    // C++:  void setThreshold(double threshold)
    private static native void setThreshold_0(long nativeObj, double threshold);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    //javadoc: AKAZE::getDefaultName()
    public  String getDefaultName()
    {

        String retVal = getDefaultName_0(nativeObj);

        return retVal;
    }

    //javadoc: AKAZE::getThreshold()
    public  double getThreshold()
    {

        double retVal = getThreshold_0(nativeObj);

        return retVal;
    }

    //javadoc: AKAZE::getDescriptorChannels()
    public  int getDescriptorChannels()
    {

        int retVal = getDescriptorChannels_0(nativeObj);

        return retVal;
    }

    //javadoc: AKAZE::getDescriptorSize()
    public  int getDescriptorSize()
    {

        int retVal = getDescriptorSize_0(nativeObj);

        return retVal;
    }

    //javadoc: AKAZE::getDescriptorType()
    public  int getDescriptorType()
    {

        int retVal = getDescriptorType_0(nativeObj);

        return retVal;
    }

    //javadoc: AKAZE::getDiffusivity()
    public  int getDiffusivity()
    {

        int retVal = getDiffusivity_0(nativeObj);

        return retVal;
    }

    //javadoc: AKAZE::getNOctaveLayers()
    public  int getNOctaveLayers()
    {

        int retVal = getNOctaveLayers_0(nativeObj);

        return retVal;
    }

    //javadoc: AKAZE::getNOctaves()
    public  int getNOctaves()
    {

        int retVal = getNOctaves_0(nativeObj);

        return retVal;
    }

    //javadoc: AKAZE::setDescriptorChannels(dch)
    public  void setDescriptorChannels(int dch)
    {

        setDescriptorChannels_0(nativeObj, dch);

        return;
    }

    //javadoc: AKAZE::setDescriptorSize(dsize)
    public  void setDescriptorSize(int dsize)
    {

        setDescriptorSize_0(nativeObj, dsize);

        return;
    }

    //javadoc: AKAZE::setDescriptorType(dtype)
    public  void setDescriptorType(int dtype)
    {

        setDescriptorType_0(nativeObj, dtype);

        return;
    }

    //javadoc: AKAZE::setDiffusivity(diff)
    public  void setDiffusivity(int diff)
    {

        setDiffusivity_0(nativeObj, diff);

        return;
    }

    //javadoc: AKAZE::setNOctaveLayers(octaveLayers)
    public  void setNOctaveLayers(int octaveLayers)
    {

        setNOctaveLayers_0(nativeObj, octaveLayers);

        return;
    }

    //javadoc: AKAZE::setNOctaves(octaves)
    public  void setNOctaves(int octaves)
    {

        setNOctaves_0(nativeObj, octaves);

        return;
    }

    //javadoc: AKAZE::setThreshold(threshold)
    public  void setThreshold(double threshold)
    {

        setThreshold_0(nativeObj, threshold);

        return;
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
