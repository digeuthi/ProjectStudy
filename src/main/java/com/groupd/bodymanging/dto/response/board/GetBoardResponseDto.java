package com.groupd.bodymanging.dto.response.board;

import com.groupd.bodymanging.dto.response.ResponseDto;
import com.groupd.bodymanging.entity.BoardEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetBoardResponseDto extends ResponseDto{
    
    private int boardNumber;
    private String boardTitle;
    private String boardImageUrl;
    private String boardWriteDatetime;
    private int viewCount;
    private String boardWriterEmail;
    private String boardWriterNickname;
   

    public GetBoardResponseDto(
        BoardEntity boardEntity)
    {
        super("SU","Success");
        this.boardNumber = boardEntity.getBoardNumber();
        this.boardTitle = boardEntity.getBoardTitle();
        this.boardImageUrl = boardEntity.getBoardImageUrl();
        this.boardWriteDatetime = boardEntity.getBoardWriteDatetime();
        this.viewCount = boardEntity.getViewCount();
        this.boardWriterEmail = boardEntity.getBoardWriterEmail();
        this.boardWriterNickname = boardEntity.getBoardWriterNickname();
        
    }
}
