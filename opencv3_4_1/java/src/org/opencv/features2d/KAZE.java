//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;

// C++: class KAZE
//javadoc: KAZE

public class KAZE extends Feature2D {

    public static final int
            DIFF_PM_G1 = 0,
            DIFF_PM_G2 = 1,
            DIFF_WEICKERT = 2,
            DIFF_CHARBONNIER = 3;

    protected KAZE(long addr) { super(addr); }

    // internal usage only
    public static KAZE __fromPtr__(long addr) { return new KAZE(addr); }


    //
    // C++: static Ptr_KAZE create(bool extended = false, bool upright = false, float threshold = 0.001f, int nOctaves = 4, int nOctaveLayers = 4, int diffusivity = KAZE::DIFF_PM_G2)
    //

    //javadoc: KAZE::create(extended, upright, threshold, nOctaves, nOctaveLayers, diffusivity)
    public static KAZE create(boolean extended, boolean upright, float threshold, int nOctaves, int nOctaveLayers, int diffusivity)
    {
        
        KAZE retVal = KAZE.__fromPtr__(create_0(extended, upright, threshold, nOctaves, nOctaveLayers, diffusivity));
        
        return retVal;
    }

    //javadoc: KAZE::create()
    public static KAZE create()
    {
        
        KAZE retVal = KAZE.__fromPtr__(create_1());
        
        return retVal;
    }


    //
    // C++:  String getDefaultName()
    //

    // C++: static Ptr_KAZE create(bool extended = false, bool upright = false, float threshold = 0.001f, int nOctaves = 4, int nOctaveLayers = 4, int diffusivity = KAZE::DIFF_PM_G2)
    private static native long create_0(boolean extended, boolean upright, float threshold, int nOctaves, int nOctaveLayers, int diffusivity);


    //
    // C++:  bool getExtended()
    //

    private static native long create_1();


    //
    // C++:  bool getUpright()
    //

    // C++:  String getDefaultName()
    private static native String getDefaultName_0(long nativeObj);


    //
    // C++:  double getThreshold()
    //

    // C++:  bool getExtended()
    private static native boolean getExtended_0(long nativeObj);


    //
    // C++:  int getDiffusivity()
    //

    // C++:  bool getUpright()
    private static native boolean getUpright_0(long nativeObj);


    //
    // C++:  int getNOctaveLayers()
    //

    // C++:  double getThreshold()
    private static native double getThreshold_0(long nativeObj);


    //
    // C++:  int getNOctaves()
    //

    // C++:  int getDiffusivity()
    private static native int getDiffusivity_0(long nativeObj);


    //
    // C++:  void setDiffusivity(int diff)
    //

    // C++:  int getNOctaveLayers()
    private static native int getNOctaveLayers_0(long nativeObj);


    //
    // C++:  void setExtended(bool extended)
    //

    // C++:  int getNOctaves()
    private static native int getNOctaves_0(long nativeObj);


    //
    // C++:  void setNOctaveLayers(int octaveLayers)
    //

    // C++:  void setDiffusivity(int diff)
    private static native void setDiffusivity_0(long nativeObj, int diff);


    //
    // C++:  void setNOctaves(int octaves)
    //

    // C++:  void setExtended(bool extended)
    private static native void setExtended_0(long nativeObj, boolean extended);


    //
    // C++:  void setThreshold(double threshold)
    //

    // C++:  void setNOctaveLayers(int octaveLayers)
    private static native void setNOctaveLayers_0(long nativeObj, int octaveLayers);


    //
    // C++:  void setUpright(bool upright)
    //

    // C++:  void setNOctaves(int octaves)
    private static native void setNOctaves_0(long nativeObj, int octaves);

    // C++:  void setThreshold(double threshold)
    private static native void setThreshold_0(long nativeObj, double threshold);

    // C++:  void setUpright(bool upright)
    private static native void setUpright_0(long nativeObj, boolean upright);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    //javadoc: KAZE::getDefaultName()
    public  String getDefaultName()
    {

        String retVal = getDefaultName_0(nativeObj);

        return retVal;
    }

    //javadoc: KAZE::getExtended()
    public  boolean getExtended()
    {

        boolean retVal = getExtended_0(nativeObj);

        return retVal;
    }

    //javadoc: KAZE::getUpright()
    public  boolean getUpright()
    {

        boolean retVal = getUpright_0(nativeObj);

        return retVal;
    }

    //javadoc: KAZE::getThreshold()
    public  double getThreshold()
    {

        double retVal = getThreshold_0(nativeObj);

        return retVal;
    }

    //javadoc: KAZE::getDiffusivity()
    public  int getDiffusivity()
    {

        int retVal = getDiffusivity_0(nativeObj);

        return retVal;
    }

    //javadoc: KAZE::getNOctaveLayers()
    public  int getNOctaveLayers()
    {

        int retVal = getNOctaveLayers_0(nativeObj);

        return retVal;
    }

    //javadoc: KAZE::getNOctaves()
    public  int getNOctaves()
    {

        int retVal = getNOctaves_0(nativeObj);

        return retVal;
    }

    //javadoc: KAZE::setDiffusivity(diff)
    public  void setDiffusivity(int diff)
    {

        setDiffusivity_0(nativeObj, diff);

        return;
    }

    //javadoc: KAZE::setExtended(extended)
    public  void setExtended(boolean extended)
    {

        setExtended_0(nativeObj, extended);

        return;
    }

    //javadoc: KAZE::setNOctaveLayers(octaveLayers)
    public  void setNOctaveLayers(int octaveLayers)
    {

        setNOctaveLayers_0(nativeObj, octaveLayers);

        return;
    }

    //javadoc: KAZE::setNOctaves(octaves)
    public  void setNOctaves(int octaves)
    {

        setNOctaves_0(nativeObj, octaves);

        return;
    }

    //javadoc: KAZE::setThreshold(threshold)
    public  void setThreshold(double threshold)
    {

        setThreshold_0(nativeObj, threshold);

        return;
    }

    //javadoc: KAZE::setUpright(upright)
    public  void setUpright(boolean upright)
    {

        setUpright_0(nativeObj, upright);

        return;
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
