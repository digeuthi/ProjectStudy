package com.groupd.bodymanging.entity.resultSet;

public interface BoardListResultSet { 
    //이거 왜 인터페이스로 하는가...
    //resultSet : API에서 데이터베이스 쿼리의 결과 집합을 나타내는 인터페이스
    //데이터베이스에서 쿼리를 실행한 후 그 결과를 
    //효율적으로 검색하고 조작할 수 있는 메서드를 정의.
    //인터페이스를 구현하여 자신들의 데이터베이스에 맞는 구체적인 동작을 제공
    //ResultSet 인터페이스는 결과 집합을 나타내는 역할만 담당하고, 
    //실제 데이터베이스와의 연결, 쿼리 실행 등과 관련된 기능은 
    //다른 JDBC 인터페이스 및 클래스에서 처리
    
    public int getBoardNumber();
    public String getTitle();
    public String getBoardContent();
    public String getBoardimageUrl();
    public String getBoardWriteDatetime();
    public int getViewCount();
    public String getBoardWriterEmail();
    public String getBoardWriterNickname();
}
