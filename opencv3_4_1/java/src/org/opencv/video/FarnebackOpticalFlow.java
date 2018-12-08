//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.video;

// C++: class FarnebackOpticalFlow
//javadoc: FarnebackOpticalFlow

public class FarnebackOpticalFlow extends DenseOpticalFlow {

    protected FarnebackOpticalFlow(long addr) { super(addr); }

    // internal usage only
    public static FarnebackOpticalFlow __fromPtr__(long addr) { return new FarnebackOpticalFlow(addr); }

    //
    // C++: static Ptr_FarnebackOpticalFlow create(int numLevels = 5, double pyrScale = 0.5, bool fastPyramids = false, int winSize = 13, int numIters = 10, int polyN = 5, double polySigma = 1.1, int flags = 0)
    //

    //javadoc: FarnebackOpticalFlow::create(numLevels, pyrScale, fastPyramids, winSize, numIters, polyN, polySigma, flags)
    public static FarnebackOpticalFlow create(int numLevels, double pyrScale, boolean fastPyramids, int winSize, int numIters, int polyN, double polySigma, int flags)
    {
        
        FarnebackOpticalFlow retVal = FarnebackOpticalFlow.__fromPtr__(create_0(numLevels, pyrScale, fastPyramids, winSize, numIters, polyN, polySigma, flags));
        
        return retVal;
    }

    //javadoc: FarnebackOpticalFlow::create()
    public static FarnebackOpticalFlow create()
    {
        
        FarnebackOpticalFlow retVal = FarnebackOpticalFlow.__fromPtr__(create_1());
        
        return retVal;
    }


    //
    // C++:  bool getFastPyramids()
    //

    // C++: static Ptr_FarnebackOpticalFlow create(int numLevels = 5, double pyrScale = 0.5, bool fastPyramids = false, int winSize = 13, int numIters = 10, int polyN = 5, double polySigma = 1.1, int flags = 0)
    private static native long create_0(int numLevels, double pyrScale, boolean fastPyramids, int winSize, int numIters, int polyN, double polySigma, int flags);


    //
    // C++:  double getPolySigma()
    //

    private static native long create_1();


    //
    // C++:  double getPyrScale()
    //

    // C++:  bool getFastPyramids()
    private static native boolean getFastPyramids_0(long nativeObj);


    //
    // C++:  int getFlags()
    //

    // C++:  double getPolySigma()
    private static native double getPolySigma_0(long nativeObj);


    //
    // C++:  int getNumIters()
    //

    // C++:  double getPyrScale()
    private static native double getPyrScale_0(long nativeObj);


    //
    // C++:  int getNumLevels()
    //

    // C++:  int getFlags()
    private static native int getFlags_0(long nativeObj);


    //
    // C++:  int getPolyN()
    //

    // C++:  int getNumIters()
    private static native int getNumIters_0(long nativeObj);


    //
    // C++:  int getWinSize()
    //

    // C++:  int getNumLevels()
    private static native int getNumLevels_0(long nativeObj);


    //
    // C++:  void setFastPyramids(bool fastPyramids)
    //

    // C++:  int getPolyN()
    private static native int getPolyN_0(long nativeObj);


    //
    // C++:  void setFlags(int flags)
    //

    // C++:  int getWinSize()
    private static native int getWinSize_0(long nativeObj);


    //
    // C++:  void setNumIters(int numIters)
    //

    // C++:  void setFastPyramids(bool fastPyramids)
    private static native void setFastPyramids_0(long nativeObj, boolean fastPyramids);


    //
    // C++:  void setNumLevels(int numLevels)
    //

    // C++:  void setFlags(int flags)
    private static native void setFlags_0(long nativeObj, int flags);


    //
    // C++:  void setPolyN(int polyN)
    //

    // C++:  void setNumIters(int numIters)
    private static native void setNumIters_0(long nativeObj, int numIters);


    //
    // C++:  void setPolySigma(double polySigma)
    //

    // C++:  void setNumLevels(int numLevels)
    private static native void setNumLevels_0(long nativeObj, int numLevels);


    //
    // C++:  void setPyrScale(double pyrScale)
    //

    // C++:  void setPolyN(int polyN)
    private static native void setPolyN_0(long nativeObj, int polyN);


    //
    // C++:  void setWinSize(int winSize)
    //

    // C++:  void setPolySigma(double polySigma)
    private static native void setPolySigma_0(long nativeObj, double polySigma);

    // C++:  void setPyrScale(double pyrScale)
    private static native void setPyrScale_0(long nativeObj, double pyrScale);

    // C++:  void setWinSize(int winSize)
    private static native void setWinSize_0(long nativeObj, int winSize);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    //javadoc: FarnebackOpticalFlow::getFastPyramids()
    public  boolean getFastPyramids()
    {

        boolean retVal = getFastPyramids_0(nativeObj);

        return retVal;
    }

    //javadoc: FarnebackOpticalFlow::getPolySigma()
    public  double getPolySigma()
    {

        double retVal = getPolySigma_0(nativeObj);

        return retVal;
    }

    //javadoc: FarnebackOpticalFlow::getPyrScale()
    public  double getPyrScale()
    {

        double retVal = getPyrScale_0(nativeObj);

        return retVal;
    }

    //javadoc: FarnebackOpticalFlow::getFlags()
    public  int getFlags()
    {

        int retVal = getFlags_0(nativeObj);

        return retVal;
    }

    //javadoc: FarnebackOpticalFlow::getNumIters()
    public  int getNumIters()
    {

        int retVal = getNumIters_0(nativeObj);

        return retVal;
    }

    //javadoc: FarnebackOpticalFlow::getNumLevels()
    public  int getNumLevels()
    {

        int retVal = getNumLevels_0(nativeObj);

        return retVal;
    }

    //javadoc: FarnebackOpticalFlow::getPolyN()
    public  int getPolyN()
    {

        int retVal = getPolyN_0(nativeObj);

        return retVal;
    }

    //javadoc: FarnebackOpticalFlow::getWinSize()
    public  int getWinSize()
    {

        int retVal = getWinSize_0(nativeObj);

        return retVal;
    }

    //javadoc: FarnebackOpticalFlow::setFastPyramids(fastPyramids)
    public  void setFastPyramids(boolean fastPyramids)
    {

        setFastPyramids_0(nativeObj, fastPyramids);

        return;
    }

    //javadoc: FarnebackOpticalFlow::setFlags(flags)
    public  void setFlags(int flags)
    {

        setFlags_0(nativeObj, flags);

        return;
    }

    //javadoc: FarnebackOpticalFlow::setNumIters(numIters)
    public  void setNumIters(int numIters)
    {

        setNumIters_0(nativeObj, numIters);

        return;
    }

    //javadoc: FarnebackOpticalFlow::setNumLevels(numLevels)
    public  void setNumLevels(int numLevels)
    {

        setNumLevels_0(nativeObj, numLevels);

        return;
    }

    //javadoc: FarnebackOpticalFlow::setPolyN(polyN)
    public  void setPolyN(int polyN)
    {

        setPolyN_0(nativeObj, polyN);

        return;
    }

    //javadoc: FarnebackOpticalFlow::setPolySigma(polySigma)
    public  void setPolySigma(double polySigma)
    {

        setPolySigma_0(nativeObj, polySigma);

        return;
    }

    //javadoc: FarnebackOpticalFlow::setPyrScale(pyrScale)
    public  void setPyrScale(double pyrScale)
    {

        setPyrScale_0(nativeObj, pyrScale);

        return;
    }

    //javadoc: FarnebackOpticalFlow::setWinSize(winSize)
    public  void setWinSize(int winSize)
    {

        setWinSize_0(nativeObj, winSize);

        return;
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
