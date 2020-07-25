package com.myproject.text;

import com.myproject.text.controller.Image;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Objects;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@EntityScan
public class image {
    private @Id @GeneratedValue Long id;
    private String Tag;
    image(){}
    image(String Tag){
        this.Tag = Tag;
    }

    public static void add(p2 b) {
    }

    public Long getId(){
        return this.id;
    }
    public String getTag(){
        return this.Tag;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setTag(String Tag){
        this.Tag = Tag;
    }
    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof image))
            return false;
        image image = (image)o ;
        return Objects.equals(this.id, image.id) && Objects.equals(this.Tag, image.Tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.Tag);
    }

    @Override
    public String toString() {
        return "image{" + "id=" + this.id + ",  Tag='" + this.Tag + '\'' + '}';
    }
class p1{

}
}
