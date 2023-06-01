package com.groupd.bodymanging.entity.resultSet;

public interface BoardListResultSet { //이거 왜 인터페이스로 하는가...
    public int getBoardNumber();
    public String getTitle();
    public String getBoardContent();
    public String getBoardimageUrl();
    public String getBoardWriteDatetime();
    public int getViewCount();
    public String getBoardWriterEmail();
    public String getBoardWriterNickname();
}
