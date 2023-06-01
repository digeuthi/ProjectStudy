package com.groupd.bodymanging.dto.response.board;

import java.util.ArrayList;
import java.util.List;

import com.groupd.bodymanging.dto.response.ResponseDto;
import com.groupd.bodymanging.entity.BoardEntity;
import com.groupd.bodymanging.entity.resultSet.BoardListResultSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
// @AllArgsConstructor 왜 이거하면 같은 메서드 중복된다고 뜨는거지
public class GetBoardListResponseDto extends ResponseDto{
    private List<BoardSummary> boardList;
    //비공개 인스턴스 변수 선언. List<BoardSummary>타입의 변수 이름 boardList

    public GetBoardListResponseDto(List<BoardListResultSet> resultSet){
        super("SU", "Sucess");

        List<BoardSummary> boardList = new ArrayList<>();
        
        for(BoardListResultSet result : resultSet){
            BoardSummary boardSummary = new BoardSummary();

            if()
        }
    }

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class BoardSummary{

    private Integer boardNumber;
    private String boardTitle;
    private String boardContent;
    private String boardImageUrl;
    private String boardWriteDatetime;
    private int viewCount;
    private String boardWriterEmail;

    public BoardSummary(BoardListResultSet resultSet){

        this.boardNumber = resultSet.getBoardNumber();
        this.boardTitle =resultSet.getTitle();
        this.boardContent=resultSet.getBoardContent();
        this.boardImageUrl=resultSet.getBoardimageUrl();
        this.boardWriteDatetime = resultSet.getBoardWriteDatetime();
        this.viewCount = resultSet.getViewCount();
        this.boardWriterEmail = resultSet.getBoardWriterEmail();

    }

    public BoardSummary(BoardEntity boardEntity){
        this.boardNumber = boardEntity.getBoardNumber();
        this.boardTitle =boardEntity.getBoardTitle();
        this.boardContent=boardEntity.getBoardContent();
        this.boardImageUrl=boardEntity.getBoardImageUrl();
        this.boardWriteDatetime = boardEntity.getBoardWriteDatetime();
        this.viewCount = boardEntity.getViewCount();
        this.boardWriterEmail = boardEntity.getBoardWriterEmail();
    }
}