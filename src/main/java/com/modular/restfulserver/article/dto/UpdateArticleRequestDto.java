package com.modular.restfulserver.article.dto;

import com.modular.restfulserver.global.exception.BuilderArgumentNotValidException;
import lombok.Getter;

import java.util.List;

@Getter
public class UpdateArticleRequestDto {

  private final String textContent;
  private final List<String> hashtags;
  private final List<String> fileDownloadUrls;

  public UpdateArticleRequestDto(String textContent, List<String> hashtags, List<String> fileDownloadUrls) {
    if (textContent == null || hashtags == null || fileDownloadUrls == null)
      throw new BuilderArgumentNotValidException("[UpdateArticleRequestDto] 인자의 null 값이 부여 됨");

    this.textContent = textContent;
    this.hashtags = hashtags;
    this.fileDownloadUrls = fileDownloadUrls;
  }

}
