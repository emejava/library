package com.library.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

@Entity(name = "bookEntity")
@Table(name = "tb_book")
public class Book {

    @Id
    @SequenceGenerator(name="bookSeq",sequenceName = "book_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "bookSeq")
    @JsonIgnore
    private long id;

    @JsonProperty("نام کتاب")
    @NotBlank(message = "نام کتاب وارد نشده")
    private String name;

    @JsonProperty("نام نویسنده")
    @NotBlank(message = "نام نویسنده وارد نشده")
    private String writer;

    @JsonProperty("امانت گیرنده")
    @ManyToOne
    private Person person;


}
