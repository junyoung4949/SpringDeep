package com.sparta.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentRequestDto {

    private Long cardId;
    private String content;
}