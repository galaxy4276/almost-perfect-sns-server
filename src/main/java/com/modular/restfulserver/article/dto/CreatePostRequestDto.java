package com.modular.restfulserver.article.dto;

import com.modular.restfulserver.article.model.Article;
import lombok.Builder;
import lombok.Getter;
import org.springframework.util.Assert;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
public class CreatePostRequestDto {

  @NotEmpty
  @Max(value = 50, message = "게시글 제목은 50글자 미만이어야 합니다.")
  private final String title;

  @NotEmpty
  @Max(value = 1000, message = "게시글 본문은 1000글자 미만이어야 합니다.")
  private final String textContent;

  @Max(5)
  private List<String> tagList;

  @Builder(setterPrefix = "add")
  public CreatePostRequestDto(
    String title,
    String textContent
  ) {
    Assert.hasText(title, "title field must be not empty");
    Assert.hasText(textContent, "textContent field must be not empty");

    this.title = title;
    this.textContent = textContent;
  }

  public Article toEntity() {
    return Article.builder()
      .addTitle(title)
      .addTextContent(textContent)
      .build();
  }

}
