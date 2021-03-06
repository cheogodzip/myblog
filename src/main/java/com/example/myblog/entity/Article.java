package com.example.myblog.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor //디폴트 생성자
@ToString
public class Article {

    @Id
    @GeneratedValue
    private  Long id;

    @Column
    private String title;

    @Column
    private String content;
}
