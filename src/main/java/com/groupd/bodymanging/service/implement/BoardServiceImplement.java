package com.groupd.bodymanging.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.groupd.bodymanging.dto.request.board.PostBoardRequestDto;
import com.groupd.bodymanging.dto.response.ResponseDto;
import com.groupd.bodymanging.dto.response.board.GetBoardListResponseDto;
import com.groupd.bodymanging.dto.response.board.GetBoardResponseDto;

import com.groupd.bodymanging.service.BoardService;

@Service
public class BoardServiceImplement implements BoardService{

    @Override
    public ResponseEntity<ResponseDto> postBoard(String email, PostBoardRequestDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postBoard'");
    }

    @Override
    public ResponseEntity<? super GetBoardResponseDto> getBoard(Integer boardNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBoard'");
    }

    // @Override
    // public ResponseEntity<? super GetBoardWordListResponseDto> getWordBoard() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getWordBoard'");
    // }

    @Override
    public ResponseEntity<? super GetBoardListResponseDto> getBoardList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBoardList'");
    }

    // @Override
    // public ResponseEntity<ResponseDto> patchBoard(String userEmail, PatchBoardRequestDto dto) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'patchBoard'");
    // }

    @Override
    public ResponseEntity<ResponseDto> deleteBoard(String email, Integer boardNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBoard'");
    }
    
}
