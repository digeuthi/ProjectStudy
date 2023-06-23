package com.groupd.bodymanging.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.groupd.bodymanging.entity.UserMenuSelect;
import com.groupd.bodymanging.entity.primaryKey.SelectPK;
import java.util.List;

import javax.transaction.Transactional;


public interface UserMenuSelectRepository extends JpaRepository<UserMenuSelect, SelectPK>{
    //데이터 타입 SelectPK으로 한 건 pk가 2개인 복합키의 경우라서 따로 만들어서 설정함.

    public boolean existsByUserCode(int userCode);

    public UserMenuSelect findByUserCode(int userCode);

    @Query(
        value=
        "UPDATE "+
        "user_menu_select "+
        "SET menu_code = ? WHERE user_code = ?; ",
        nativeQuery = true)
    @Modifying
    @Transactional
    public int patchMenuCode(String menuCode, Integer userCode);
    //@Modifying
    //수정(UPDATE, DELETE) 쿼리를 실행하는 메서드에 적용됩니다. 
    //JPA는 일반적으로 조회(SELECT) 쿼리는 자동으로 인식하지만, 
    //수정 쿼리는 @Modifying 어노테이션을 사용하여 명시적으로 알려주어야 합니다. 
    //이 어노테이션을 사용하면 스프링은 해당 쿼리를 실행하고 영향을 받는 
    //행의 수를 반환합니다.

    //메서드의 반환 타입으로 int를 사용하는 이유는 
    //@Modifying 어노테이션과 함께 사용되는 UPDATE, DELETE, INSERT 등의 
    //수정 쿼리는 영향을 받은 행의 수를 반환하기 때문입니다. 
    //반환되는 int 값은 데이터베이스에서 실제로 변경된 레코드의 수를 나타냅니다.
    //작업이 성공적으로 수행되었는지 또는 얼마나 많은 레코드가 수정되었는지를 확인.

}
