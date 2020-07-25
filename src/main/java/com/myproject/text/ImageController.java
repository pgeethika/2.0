package com.myproject.text;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.myproject.text.controller.Image;
import org.springframework.web.bind.annotation.*;

import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.*;


        import javax.imageio.IIOImage;
        import javax.imageio.ImageIO;
        import javax.imageio.ImageWriteParam;
        import javax.imageio.ImageWriter;
        import javax.imageio.stream.ImageOutputStream;
        import java.awt.image.BufferedImage;
        import java.io.File;
        import java.io.FileOutputStream;
        import java.io.IOException;
        import java.io.OutputStream;
import java.util.ListIterator;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ImageController {
    // Aggregate root
    image img = new image();

    @GetMapping("/image")
    List<image> all() {
        return null;
    }

    @PostMapping("/image")
    image newimage(@RequestBody image newimage) {

     class CompressImages {
List img;
        void main(String... args) throws IOException {
            List<String> list=new ArrayList<String>();

            list.add("p1.JPG");
            list.add("p2.JPG");
            list.add("p3.JPG");
            list.add("p4.JPG");
            list.add("p5.JPG");
            System.out.println("Returning element: "+list.get(0));

            list.set(0,"p1.JPG");

            for(String image:list)
                System.out.println(image);
             class MultiObjectSerialization {
                 String file = "image.docx";
                 ObjectOutputStream os;
                 ObjectInputStream is;


                  void main(String[] args) throws IOException,
                        ClassNotFoundException {
                    p1 a = new p1(1,"p1.PNG");
                    p2 b = new p2(2,"p2.PNG");
                      p3 c = new p3(3,"p3.PNG");
                      p4 d = new p4(4,"p4.PNG");
                      p5 e = new p5(5,"p4.PNG");
                    List<Object> image = new ArrayList<>();
                    image.add(b);
                    image.add(c);
                      image.add(d);
                      image.add(e);
                      image.add(a);
                    writeToFile(image);
                    readFile();

                }

                 void writeToFile(List<Object> images) throws IOException {
                    os = new ObjectOutputStream(new FileOutputStream(file));
                    os.writeObject(images);
                    os.close();

                }
                void readFile() throws ClassNotFoundException, IOException {
                    is = new ObjectInputStream(new FileInputStream(file));
                    List<Object> input = (List<Object>) is.readObject();
                    List<Object> checkList = new ArrayList<>();

                    for (Object l : input) {
                        checkList.add(l.getClass().getSimpleName());
                        if (l instanceof p1) {
                            p1 aa = (p1) l;
                            System.out.println(aa.id);
                            System.out.println(aa.Tag);
                        }
                        if (l instanceof p2) {
                            p2  aa = (p2) l;
                            System.out.println(aa.id);
                            System.out.println(aa.Tag);


                        }
                        if (l instanceof p3) {
                            p3 aa = (p3) l;
                            System.out.println(aa.id);
                            System.out.println(aa.Tag);


                        }
                        if (l instanceof p4) {
                            p4  aa = (p4) l;
                            System.out.println(aa.id);
                            System.out.println(aa.Tag);


                        }
                        if (l instanceof p5) {
                            p5 aa = (p5) l;
                            System.out.println(aa.id);
                            System.out.println(aa.Tag);


                        }
                    }
                    System.out.println(checkList);

                    is.close();
                }
            }
            class p1 implements Serializable {
                private static final long serialVersionUID = 1L;
                int id;
                String Tag;

                public p1(int id, String Tag) {
                    this.id = id;
                    this.Tag = Tag;
                }
            }

            class p2 implements Serializable {
                private static final long serialVersionUID = 1L;
                int id;
                String Tag;

                public p2(int id, String Tag) {
                    this.id = id;
                    this.Tag = Tag;
                }
            }
            class p3 implements Serializable {
                private static final long serialVersionUID = 1L;
                int id;
                String Tag;

                public p3(int id, String Tag) {
                    this.id = id;
                    this.Tag = Tag;
                }
            }
            class p4 implements Serializable {
                private static final long serialVersionUID = 1L;
                int id;
                String Tag;

                public p4(int id, String Tag) {
                    this.id = id;
                    this.Tag = Tag;
                }
            }
            class p5 implements Serializable {
                private static final long serialVersionUID = 1L;
                int id;
                String Tag;

                public p5(int id, String Tag) {
                    this.id = id;
                    this.Tag = Tag;
                }
            }



            File input = new File("/Desktop/p1.jpg");
            BufferedImage image = ImageIO.read(input);

            File output = new File("/Desktop/p1-compressed-005.jpg");
            OutputStream out = new FileOutputStream(output);

            ImageWriter writer = ImageIO.getImageWritersByFormatName("jpg").next();
            ImageOutputStream ios = ImageIO.createImageOutputStream(out);
            writer.setOutput(ios);

            ImageWriteParam param = writer.getDefaultWriteParam();
            if (param.canWriteCompressed()) {
                param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
                param.setCompressionQuality(0.05f);
            }

            writer.write(null, new IIOImage(image, null, null), param);

            out.close();
            ios.close();
            writer.dispose();

        }

    }
        return(newimage);

}
    // Single item

    @GetMapping("/employees/{id}")
    image one(@PathVariable Long id) {
        return null;

    }

    @PutMapping("/employees/{id}")
    image replaceimage(@RequestBody image newimage, @PathVariable Long id) {
        return null;

    }

    @DeleteMapping("/image/{id}")
    void deleteimage(@PathVariable Long id) {

    }

    class imageNotFoundException extends RuntimeException {
        imageNotFoundException(Long id) {
            super("Could not find image" + id);
        }


    }


}