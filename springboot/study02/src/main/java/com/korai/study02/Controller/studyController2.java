package com.korai.study02.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Tag(name = "List·Map 응답 실습", description = "Java의 List는 JSON 배열로, Map은 JSON 객체로 반환되는 과정을 학습합니다.")
@ApiResponses({
        @ApiResponse(responseCode = "404", description = "등록되지 않은 URL로 요청한 경우입니다.", content = @Content),
        @ApiResponse(responseCode = "405", description = "해당 URL에서 GET 이외의 HTTP 메서드로 요청한 경우입니다.", content = @Content)
})
@RequestMapping(value = "/api/study2", produces = "application/json")
@RestController
public class studyController2 {

    @Operation(summary = "List 응답 확인", description = "문자열을 List에 추가해 반환합니다. List의 요소는 순서대로 JSON 배열에 담깁니다.")
    @ApiResponse(responseCode = "200", description = "문자열 목록 조회 성공",
            content = @Content(mediaType = "application/json",
                    examples = @ExampleObject(value = "[\"Java\", \"Spring Boot\", \"MySQL\"]")))
    @GetMapping("/list")
    public List<String> getList() {
        // List: 같은 타입의 데이터를 순서대로 저장합니다.
        List<String> subjects = new ArrayList<>();
        subjects.add("Java");
        subjects.add("Spring Boot");
        subjects.add("MySQL");

        // @RestController가 반환값을 JSON 배열로 변환합니다.
        return subjects;
    }

    @Operation(summary = "Map 응답 확인", description = "키와 값을 Map에 담아 반환합니다. String, 숫자, boolean 등 서로 다른 값 타입을 Object로 담을 수 있습니다.")
    @ApiResponse(responseCode = "200", description = "학습자 정보 조회 성공",
            content = @Content(mediaType = "application/json",
                    examples = @ExampleObject(value = "{\"name\":\"홍길동\",\"age\":20,\"studying\":true}")))
    @GetMapping("/map")
    public Map<String, Object> getMap() {
        // Map: 키로 값을 구분합니다. 같은 키에 다시 put하면 기존 값이 변경됩니다.
        // LinkedHashMap은 값을 추가한 순서를 유지합니다.
        Map<String, Object> student = new LinkedHashMap<>();
        student.put("name", "홍길동");
        student.put("age", 20);
        student.put("studying", true);

        return student;
    }

    @Operation(summary = "Map 안에 List 담기", description = "Map의 값으로 List를 넣어 목록과 개수를 함께 반환합니다. JSON 객체 안에 배열이 포함되는 예제입니다.")
    @ApiResponse(responseCode = "200", description = "학습 과목과 개수 조회 성공",
            content = @Content(mediaType = "application/json",
                    examples = @ExampleObject(value = "{\"subjects\":[\"Java\",\"Spring Boot\",\"MySQL\"],\"count\":3}")))
    @GetMapping("/map-list")
    public Map<String, Object> getMapWithList() {
        List<String> subjects = getList();

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("subjects", subjects);
        response.put("count", subjects.size());

        return response;
    }
}
