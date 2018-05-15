//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;

// C++: class Boost
//javadoc: Boost

public class Boost extends DTrees {

    public static final int
            DISCRETE = 0,
            REAL = 1,
            LOGIT = 2,
            GENTLE = 3;

    protected Boost(long addr) { super(addr); }

    // internal usage only
    public static Boost __fromPtr__(long addr) { return new Boost(addr); }


    //
    // C++: static Ptr_Boost create()
    //

    //javadoc: Boost::create()
    public static Boost create()
    {
        
        Boost retVal = Boost.__fromPtr__(create_0());
        
        return retVal;
    }


    //
    // C++: static Ptr_Boost load(String filepath, String nodeName = String())
    //

    //javadoc: Boost::load(filepath, nodeName)
    public static Boost load(String filepath, String nodeName)
    {
        
        Boost retVal = Boost.__fromPtr__(load_0(filepath, nodeName));
        
        return retVal;
    }

    //javadoc: Boost::load(filepath)
    public static Boost load(String filepath)
    {
        
        Boost retVal = Boost.__fromPtr__(load_1(filepath));
        
        return retVal;
    }


    //
    // C++:  double getWeightTrimRate()
    //

    // C++: static Ptr_Boost create()
    private static native long create_0();


    //
    // C++:  int getBoostType()
    //

    // C++: static Ptr_Boost load(String filepath, String nodeName = String())
    private static native long load_0(String filepath, String nodeName);


    //
    // C++:  int getWeakCount()
    //

    private static native long load_1(String filepath);


    //
    // C++:  void setBoostType(int val)
    //

    // C++:  double getWeightTrimRate()
    private static native double getWeightTrimRate_0(long nativeObj);


    //
    // C++:  void setWeakCount(int val)
    //

    // C++:  int getBoostType()
    private static native int getBoostType_0(long nativeObj);


    //
    // C++:  void setWeightTrimRate(double val)
    //

    // C++:  int getWeakCount()
    private static native int getWeakCount_0(long nativeObj);

    // C++:  void setBoostType(int val)
    private static native void setBoostType_0(long nativeObj, int val);

    // C++:  void setWeakCount(int val)
    private static native void setWeakCount_0(long nativeObj, int val);

    // C++:  void setWeightTrimRate(double val)
    private static native void setWeightTrimRate_0(long nativeObj, double val);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    //javadoc: Boost::getWeightTrimRate()
    public  double getWeightTrimRate()
    {

        double retVal = getWeightTrimRate_0(nativeObj);

        return retVal;
    }

    //javadoc: Boost::getBoostType()
    public  int getBoostType()
    {

        int retVal = getBoostType_0(nativeObj);

        return retVal;
    }

    //javadoc: Boost::getWeakCount()
    public  int getWeakCount()
    {

        int retVal = getWeakCount_0(nativeObj);

        return retVal;
    }

    //javadoc: Boost::setBoostType(val)
    public  void setBoostType(int val)
    {

        setBoostType_0(nativeObj, val);

        return;
    }

    //javadoc: Boost::setWeakCount(val)
    public  void setWeakCount(int val)
    {

        setWeakCount_0(nativeObj, val);

        return;
    }

    //javadoc: Boost::setWeightTrimRate(val)
    public  void setWeightTrimRate(double val)
    {

        setWeightTrimRate_0(nativeObj, val);

        return;
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
