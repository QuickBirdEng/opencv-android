//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;

// C++: class ORB
//javadoc: ORB

public class ORB extends Feature2D {

    public static final int
            kBytes = 32,
            HARRIS_SCORE = 0,
            FAST_SCORE = 1;

    protected ORB(long addr) { super(addr); }

    // internal usage only
    public static ORB __fromPtr__(long addr) { return new ORB(addr); }


    //
    // C++: static Ptr_ORB create(int nfeatures = 500, float scaleFactor = 1.2f, int nlevels = 8, int edgeThreshold = 31, int firstLevel = 0, int WTA_K = 2, int scoreType = ORB::HARRIS_SCORE, int patchSize = 31, int fastThreshold = 20)
    //

    //javadoc: ORB::create(nfeatures, scaleFactor, nlevels, edgeThreshold, firstLevel, WTA_K, scoreType, patchSize, fastThreshold)
    public static ORB create(int nfeatures, float scaleFactor, int nlevels, int edgeThreshold, int firstLevel, int WTA_K, int scoreType, int patchSize, int fastThreshold)
    {
        
        ORB retVal = ORB.__fromPtr__(create_0(nfeatures, scaleFactor, nlevels, edgeThreshold, firstLevel, WTA_K, scoreType, patchSize, fastThreshold));
        
        return retVal;
    }

    //javadoc: ORB::create()
    public static ORB create()
    {
        
        ORB retVal = ORB.__fromPtr__(create_1());
        
        return retVal;
    }


    //
    // C++:  String getDefaultName()
    //

    // C++: static Ptr_ORB create(int nfeatures = 500, float scaleFactor = 1.2f, int nlevels = 8, int edgeThreshold = 31, int firstLevel = 0, int WTA_K = 2, int scoreType = ORB::HARRIS_SCORE, int patchSize = 31, int fastThreshold = 20)
    private static native long create_0(int nfeatures, float scaleFactor, int nlevels, int edgeThreshold, int firstLevel, int WTA_K, int scoreType, int patchSize, int fastThreshold);


    //
    // C++:  double getScaleFactor()
    //

    private static native long create_1();


    //
    // C++:  int getEdgeThreshold()
    //

    // C++:  String getDefaultName()
    private static native String getDefaultName_0(long nativeObj);


    //
    // C++:  int getFastThreshold()
    //

    // C++:  double getScaleFactor()
    private static native double getScaleFactor_0(long nativeObj);


    //
    // C++:  int getFirstLevel()
    //

    // C++:  int getEdgeThreshold()
    private static native int getEdgeThreshold_0(long nativeObj);


    //
    // C++:  int getMaxFeatures()
    //

    // C++:  int getFastThreshold()
    private static native int getFastThreshold_0(long nativeObj);


    //
    // C++:  int getNLevels()
    //

    // C++:  int getFirstLevel()
    private static native int getFirstLevel_0(long nativeObj);


    //
    // C++:  int getPatchSize()
    //

    // C++:  int getMaxFeatures()
    private static native int getMaxFeatures_0(long nativeObj);


    //
    // C++:  int getScoreType()
    //

    // C++:  int getNLevels()
    private static native int getNLevels_0(long nativeObj);


    //
    // C++:  int getWTA_K()
    //

    // C++:  int getPatchSize()
    private static native int getPatchSize_0(long nativeObj);


    //
    // C++:  void setEdgeThreshold(int edgeThreshold)
    //

    // C++:  int getScoreType()
    private static native int getScoreType_0(long nativeObj);


    //
    // C++:  void setFastThreshold(int fastThreshold)
    //

    // C++:  int getWTA_K()
    private static native int getWTA_K_0(long nativeObj);


    //
    // C++:  void setFirstLevel(int firstLevel)
    //

    // C++:  void setEdgeThreshold(int edgeThreshold)
    private static native void setEdgeThreshold_0(long nativeObj, int edgeThreshold);


    //
    // C++:  void setMaxFeatures(int maxFeatures)
    //

    // C++:  void setFastThreshold(int fastThreshold)
    private static native void setFastThreshold_0(long nativeObj, int fastThreshold);


    //
    // C++:  void setNLevels(int nlevels)
    //

    // C++:  void setFirstLevel(int firstLevel)
    private static native void setFirstLevel_0(long nativeObj, int firstLevel);


    //
    // C++:  void setPatchSize(int patchSize)
    //

    // C++:  void setMaxFeatures(int maxFeatures)
    private static native void setMaxFeatures_0(long nativeObj, int maxFeatures);


    //
    // C++:  void setScaleFactor(double scaleFactor)
    //

    // C++:  void setNLevels(int nlevels)
    private static native void setNLevels_0(long nativeObj, int nlevels);


    //
    // C++:  void setScoreType(int scoreType)
    //

    // C++:  void setPatchSize(int patchSize)
    private static native void setPatchSize_0(long nativeObj, int patchSize);


    //
    // C++:  void setWTA_K(int wta_k)
    //

    // C++:  void setScaleFactor(double scaleFactor)
    private static native void setScaleFactor_0(long nativeObj, double scaleFactor);

    // C++:  void setScoreType(int scoreType)
    private static native void setScoreType_0(long nativeObj, int scoreType);

    // C++:  void setWTA_K(int wta_k)
    private static native void setWTA_K_0(long nativeObj, int wta_k);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    //javadoc: ORB::getDefaultName()
    public  String getDefaultName()
    {

        String retVal = getDefaultName_0(nativeObj);

        return retVal;
    }

    //javadoc: ORB::getScaleFactor()
    public  double getScaleFactor()
    {

        double retVal = getScaleFactor_0(nativeObj);

        return retVal;
    }

    //javadoc: ORB::getEdgeThreshold()
    public  int getEdgeThreshold()
    {

        int retVal = getEdgeThreshold_0(nativeObj);

        return retVal;
    }

    //javadoc: ORB::getFastThreshold()
    public  int getFastThreshold()
    {

        int retVal = getFastThreshold_0(nativeObj);

        return retVal;
    }

    //javadoc: ORB::getFirstLevel()
    public  int getFirstLevel()
    {

        int retVal = getFirstLevel_0(nativeObj);

        return retVal;
    }

    //javadoc: ORB::getMaxFeatures()
    public  int getMaxFeatures()
    {

        int retVal = getMaxFeatures_0(nativeObj);

        return retVal;
    }

    //javadoc: ORB::getNLevels()
    public  int getNLevels()
    {

        int retVal = getNLevels_0(nativeObj);

        return retVal;
    }

    //javadoc: ORB::getPatchSize()
    public  int getPatchSize()
    {

        int retVal = getPatchSize_0(nativeObj);

        return retVal;
    }

    //javadoc: ORB::getScoreType()
    public  int getScoreType()
    {

        int retVal = getScoreType_0(nativeObj);

        return retVal;
    }

    //javadoc: ORB::getWTA_K()
    public  int getWTA_K()
    {

        int retVal = getWTA_K_0(nativeObj);

        return retVal;
    }

    //javadoc: ORB::setEdgeThreshold(edgeThreshold)
    public  void setEdgeThreshold(int edgeThreshold)
    {

        setEdgeThreshold_0(nativeObj, edgeThreshold);

        return;
    }

    //javadoc: ORB::setFastThreshold(fastThreshold)
    public  void setFastThreshold(int fastThreshold)
    {

        setFastThreshold_0(nativeObj, fastThreshold);

        return;
    }

    //javadoc: ORB::setFirstLevel(firstLevel)
    public  void setFirstLevel(int firstLevel)
    {

        setFirstLevel_0(nativeObj, firstLevel);

        return;
    }

    //javadoc: ORB::setMaxFeatures(maxFeatures)
    public  void setMaxFeatures(int maxFeatures)
    {

        setMaxFeatures_0(nativeObj, maxFeatures);

        return;
    }

    //javadoc: ORB::setNLevels(nlevels)
    public  void setNLevels(int nlevels)
    {

        setNLevels_0(nativeObj, nlevels);

        return;
    }

    //javadoc: ORB::setPatchSize(patchSize)
    public  void setPatchSize(int patchSize)
    {

        setPatchSize_0(nativeObj, patchSize);

        return;
    }

    //javadoc: ORB::setScaleFactor(scaleFactor)
    public  void setScaleFactor(double scaleFactor)
    {

        setScaleFactor_0(nativeObj, scaleFactor);

        return;
    }

    //javadoc: ORB::setScoreType(scoreType)
    public  void setScoreType(int scoreType)
    {

        setScoreType_0(nativeObj, scoreType);

        return;
    }

    //javadoc: ORB::setWTA_K(wta_k)
    public  void setWTA_K(int wta_k)
    {

        setWTA_K_0(nativeObj, wta_k);

        return;
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
