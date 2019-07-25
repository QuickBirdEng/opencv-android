//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.img_hash;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfDouble;
import org.opencv.img_hash.BlockMeanHash;
import org.opencv.img_hash.ImgHashBase;
import org.opencv.utils.Converters;

// C++: class BlockMeanHash
//javadoc: BlockMeanHash

public class BlockMeanHash extends ImgHashBase {

    protected BlockMeanHash(long addr) { super(addr); }

    // internal usage only
    public static BlockMeanHash __fromPtr__(long addr) { return new BlockMeanHash(addr); }

    //
    // C++: static Ptr_BlockMeanHash cv::img_hash::BlockMeanHash::create(int mode = BLOCK_MEAN_HASH_MODE_0)
    //

    //javadoc: BlockMeanHash::create(mode)
    public static BlockMeanHash create(int mode)
    {
        
        BlockMeanHash retVal = BlockMeanHash.__fromPtr__(create_0(mode));
        
        return retVal;
    }

    //javadoc: BlockMeanHash::create()
    public static BlockMeanHash create()
    {
        
        BlockMeanHash retVal = BlockMeanHash.__fromPtr__(create_1());
        
        return retVal;
    }


    //
    // C++:  vector_double cv::img_hash::BlockMeanHash::getMean()
    //

    //javadoc: BlockMeanHash::getMean()
    public  MatOfDouble getMean()
    {
        
        MatOfDouble retVal = MatOfDouble.fromNativeAddr(getMean_0(nativeObj));
        
        return retVal;
    }


    //
    // C++:  void cv::img_hash::BlockMeanHash::setMode(int mode)
    //

    //javadoc: BlockMeanHash::setMode(mode)
    public  void setMode(int mode)
    {
        
        setMode_0(nativeObj, mode);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_BlockMeanHash cv::img_hash::BlockMeanHash::create(int mode = BLOCK_MEAN_HASH_MODE_0)
    private static native long create_0(int mode);
    private static native long create_1();

    // C++:  vector_double cv::img_hash::BlockMeanHash::getMean()
    private static native long getMean_0(long nativeObj);

    // C++:  void cv::img_hash::BlockMeanHash::setMode(int mode)
    private static native void setMode_0(long nativeObj, int mode);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
