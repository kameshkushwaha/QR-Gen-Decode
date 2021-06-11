package quickresponseCodes.implementation;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import quickresponseCodes.Author;

import java.io.File;
import java.io.IOException;

@Author(name="kamesh kushwaha ",date="5 Jan 2020")
public class Generation {

    public static void generateQRCode(String text,int width,int height, String path)throws IOException,WriterException{
        QRCodeWriter writer=new QRCodeWriter();
        BitMatrix bitMatrix=writer.encode(text,BarcodeFormat.QR_CODE,width,height);
        MatrixToImageWriter.writeToFile(bitMatrix,"PNG",new File(path));
    }
}
