package com.groupd.bodymanging.service;

import org.springframework.http.ResponseEntity;


import com.groupd.bodymanging.dto.request.board.PostBoardRequestDto;
import com.groupd.bodymanging.dto.response.ResponseDto;
import com.groupd.bodymanging.dto.response.board.GetBoardListResponseDto;
import com.groupd.bodymanging.dto.response.board.GetBoardResponseDto;


public interface BoardService {
    public ResponseEntity<ResponseDto> postBoard(String email, PostBoardRequestDto dto);
    public ResponseEntity<? super GetBoardResponseDto> getBoard(Integer boardNumber);
    // public ResponseEntity<? super GetBoardWordListResponseDto> getWordBoard();
    public ResponseEntity<? super GetBoardListResponseDto> getBoardList();
    
    // public ResponseEntity<ResponseDto> patchBoard(String userEmail, PatchBoardRequestDto dto);
    public ResponseEntity<ResponseDto> deleteBoard(String email, Integer boardNumber);
}
