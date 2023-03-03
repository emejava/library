package com.library.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

@Entity(name="messageEntity")
@Table(name="tb_message")
public class Message {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JsonProperty("متن پیام")
    @NotBlank(message = "متن پیام را وارد کنید")
    private String ms;

    @OneToOne
    private User sender;

    @OneToOne
    @NotBlank(message = "گیرنده را انتخاب کنید")
    private User receiver;
}
