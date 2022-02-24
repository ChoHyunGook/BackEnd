package com.bbong.api.member.controller;

import com.bbong.api.member.domain.MemberDTO;
import com.bbong.api.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * packageName: com.bbong.api.member.controller
 * fileName        : MemberController
 * author           : chohyungook
 * date               : 2022-02-11
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         chohyungook        최초 생성
 */
@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService service;

    @GetMapping("/member/bmi/{name}/{inch}/{weight}")
    public String getBmi(@PathVariable String name,
                         @PathVariable double inch,
                         @PathVariable double weight){
        System.out.println("리액트에서 넘어온 이름:"+name);
        System.out.println("리액트에서 넘어온 키:"+inch);
        System.out.println("리액트에서 넘어온 몸무게:"+weight);
        return "BMI 정상임";
    }

}
