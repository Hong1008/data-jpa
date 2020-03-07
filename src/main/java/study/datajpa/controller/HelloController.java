package study.datajpa.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import study.datajpa.repository.MemberRepository;

@RequiredArgsConstructor
@Controller
public class HelloController {

    private final MemberRepository memberRepository;


}
