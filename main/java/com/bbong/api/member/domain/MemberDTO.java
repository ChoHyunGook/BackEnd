package com.bbong.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.bbong.api.buy.domain
 * fileName        : MemberDTO
 * author           : chohyungook
 * date               : 2022-02-11
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         chohyungook        최초 생성
 */
@Data//겟셋
@Component//싱글
public class MemberDTO {
    private String id;
    private String name;
    private int numberr;
    private String addr;
    private String phone1;
    private String phone2;
    private double inch;
    private double weight;
    private String regDate;
}