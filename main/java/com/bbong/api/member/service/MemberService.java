package com.bbong.api.member.service;

/**
 * packageName: com.bbong.api.member.service
 * fileName        : MemberService
 * author           : chohyungook
 * date               : 2022-02-11
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         chohyungook        최초 생성
 */
public interface MemberService {
    String memberList();
    String memberInfo();
    String sendList();
    String mailSend();
    String savingMoneyList();
    String calc();
    String bmi();
    String grade();
}
