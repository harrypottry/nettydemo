package com.test.netty.lesson6.pattern;

import io.netty.buffer.*;
import io.netty.util.ByteProcessor;

/**
 *
 */
public class IterableTest {

//    public static void main(String[] args) {
//        ByteBuf a = Unpooled.wrappedBuffer(new byte[]{1,2,3});
//
//        a.forEachByte(new ByteProcessor() {
//            public boolean process(byte b) throws Exception {
//                System.out.println(b);
//                return true;
//            }
//        });
//    }


    public static void main(String[] args) {
       ByteBuf a = Unpooled.wrappedBuffer(new byte[]{1,2,3});
       ByteBuf b = Unpooled.wrappedBuffer(new byte[]{4,5,6});

       ByteBuf merge = merge(a,b);
       merge.forEachByte(new ByteProcessor() {
           public boolean process(byte b) throws Exception {
               System.out.println(b);
               return true;
           }
       });
    }

//    public static ByteBuf merge(ByteBuf a,ByteBuf b){
//        ByteBuf byteBuf = ByteBufAllocator.DEFAULT.ioBuffer();
//        byteBuf.writeBytes(a);
//        byteBuf.writeBytes(b);
//        return  byteBuf;
//    }


    //零拷贝
    public static ByteBuf merge(ByteBuf a,ByteBuf b){
        CompositeByteBuf byteBuf = ByteBufAllocator.DEFAULT.compositeBuffer(2);
        byteBuf.addComponent(true,a);
        byteBuf.addComponent(true,b);
        return  byteBuf;
    }


}
