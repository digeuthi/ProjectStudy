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
        //List<BoardListResultSet> 타입의 resultSet 매개변수

        List<BoardSummary> boardList = new ArrayList<>();
        //boardList라는 이름의 ArrayList<BoardSummary> 타입의 지역 변수를 선언하고 초기화. 
        //이 변수는 생성자 내에서만 사용됩니다.
        
        // for(Object result : resultSet) {
            //resultSet 리스트의 각 요소에 대해 반복문을 실행합니다. 
            //각 요소는 result 변수에 저장됩니다.
        //     BoardSummary boardSummary = new BoardSummary();
            //BoardSummary 클래스의 인스턴스를 생성하여 boardSummary 변수에 할당. 
            //초기값으로 빈 객체가 생성됩니다.

        //     if (result instanceof BoardEntity)
                //result 변수가 BoardEntity 타입의 인스턴스인지 확인합니다
        //         boardSummary = new BoardSummary((BoardEntity) result);
        //     if (result instanceof BoardListResultSet)
        //         boardSummary = new BoardSummary((BoardListResultSet) result);

        //     boardList.add(boardSummary);
        // }
        // this.boardList = boardList;
        
        for(BoardListResultSet result : resultSet){
            BoardSummary boardSummary = new BoardSummary(result);
            boardList.add(boardSummary);
        }
        this.boardList = boardList;
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