package com.modular.restfulserver.article.exception;

import com.modular.restfulserver.global.exception.CustomException;
import com.modular.restfulserver.global.exception.ErrorCode;

public class AlreadyExistsLikeException extends CustomException {
  public AlreadyExistsLikeException() {
    super(ErrorCode.ALREADY_LIKE_INFO);
  }
}
