//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.text;

import java.lang.String;
import org.opencv.core.Mat;
import org.opencv.text.BaseOCR;
import org.opencv.text.OCRBeamSearchDecoder;

// C++: class OCRBeamSearchDecoder
//javadoc: OCRBeamSearchDecoder

public class OCRBeamSearchDecoder extends BaseOCR {

    protected OCRBeamSearchDecoder(long addr) { super(addr); }

    // internal usage only
    public static OCRBeamSearchDecoder __fromPtr__(long addr) { return new OCRBeamSearchDecoder(addr); }

    //
    // C++: static Ptr_OCRBeamSearchDecoder cv::text::OCRBeamSearchDecoder::create(Ptr_OCRBeamSearchDecoder_ClassifierCallback classifier, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table, int mode = OCR_DECODER_VITERBI, int beam_size = 500)
    //

    // Unknown type 'Ptr_OCRBeamSearchDecoder_ClassifierCallback' (I), skipping the function


    //
    // C++: static Ptr_OCRBeamSearchDecoder cv::text::OCRBeamSearchDecoder::create(String filename, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table, int mode = OCR_DECODER_VITERBI, int beam_size = 500)
    //

    //javadoc: OCRBeamSearchDecoder::create(filename, vocabulary, transition_probabilities_table, emission_probabilities_table, mode, beam_size)
    public static OCRBeamSearchDecoder create(String filename, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table, int mode, int beam_size)
    {
        
        OCRBeamSearchDecoder retVal = OCRBeamSearchDecoder.__fromPtr__(create_0(filename, vocabulary, transition_probabilities_table.nativeObj, emission_probabilities_table.nativeObj, mode, beam_size));
        
        return retVal;
    }

    //javadoc: OCRBeamSearchDecoder::create(filename, vocabulary, transition_probabilities_table, emission_probabilities_table, mode)
    public static OCRBeamSearchDecoder create(String filename, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table, int mode)
    {
        
        OCRBeamSearchDecoder retVal = OCRBeamSearchDecoder.__fromPtr__(create_1(filename, vocabulary, transition_probabilities_table.nativeObj, emission_probabilities_table.nativeObj, mode));
        
        return retVal;
    }

    //javadoc: OCRBeamSearchDecoder::create(filename, vocabulary, transition_probabilities_table, emission_probabilities_table)
    public static OCRBeamSearchDecoder create(String filename, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table)
    {
        
        OCRBeamSearchDecoder retVal = OCRBeamSearchDecoder.__fromPtr__(create_2(filename, vocabulary, transition_probabilities_table.nativeObj, emission_probabilities_table.nativeObj));
        
        return retVal;
    }


    //
    // C++:  String cv::text::OCRBeamSearchDecoder::run(Mat image, Mat mask, int min_confidence, int component_level = 0)
    //

    //javadoc: OCRBeamSearchDecoder::run(image, mask, min_confidence, component_level)
    public  String run(Mat image, Mat mask, int min_confidence, int component_level)
    {
        
        String retVal = run_0(nativeObj, image.nativeObj, mask.nativeObj, min_confidence, component_level);
        
        return retVal;
    }

    //javadoc: OCRBeamSearchDecoder::run(image, mask, min_confidence)
    public  String run(Mat image, Mat mask, int min_confidence)
    {
        
        String retVal = run_1(nativeObj, image.nativeObj, mask.nativeObj, min_confidence);
        
        return retVal;
    }


    //
    // C++:  String cv::text::OCRBeamSearchDecoder::run(Mat image, int min_confidence, int component_level = 0)
    //

    //javadoc: OCRBeamSearchDecoder::run(image, min_confidence, component_level)
    public  String run(Mat image, int min_confidence, int component_level)
    {
        
        String retVal = run_2(nativeObj, image.nativeObj, min_confidence, component_level);
        
        return retVal;
    }

    //javadoc: OCRBeamSearchDecoder::run(image, min_confidence)
    public  String run(Mat image, int min_confidence)
    {
        
        String retVal = run_3(nativeObj, image.nativeObj, min_confidence);
        
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_OCRBeamSearchDecoder cv::text::OCRBeamSearchDecoder::create(String filename, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table, int mode = OCR_DECODER_VITERBI, int beam_size = 500)
    private static native long create_0(String filename, String vocabulary, long transition_probabilities_table_nativeObj, long emission_probabilities_table_nativeObj, int mode, int beam_size);
    private static native long create_1(String filename, String vocabulary, long transition_probabilities_table_nativeObj, long emission_probabilities_table_nativeObj, int mode);
    private static native long create_2(String filename, String vocabulary, long transition_probabilities_table_nativeObj, long emission_probabilities_table_nativeObj);

    // C++:  String cv::text::OCRBeamSearchDecoder::run(Mat image, Mat mask, int min_confidence, int component_level = 0)
    private static native String run_0(long nativeObj, long image_nativeObj, long mask_nativeObj, int min_confidence, int component_level);
    private static native String run_1(long nativeObj, long image_nativeObj, long mask_nativeObj, int min_confidence);

    // C++:  String cv::text::OCRBeamSearchDecoder::run(Mat image, int min_confidence, int component_level = 0)
    private static native String run_2(long nativeObj, long image_nativeObj, int min_confidence, int component_level);
    private static native String run_3(long nativeObj, long image_nativeObj, int min_confidence);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
