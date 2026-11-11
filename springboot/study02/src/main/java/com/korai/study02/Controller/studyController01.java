package com.korai.study02.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "HTTP 메서드 실습", description = "GET, POST, DELETE, PUT 요청 매핑을 확인하는 실습 API입니다. 각 API는 확인용 문자열만 반환합니다.")
@ApiResponses({
        @ApiResponse(responseCode = "400", description = "잘못된 요청: HTTP 요청 형식이 올바르지 않은 경우입니다. 현재 API에는 별도의 입력값 검증이 없습니다.",
                content = @Content),
        @ApiResponse(responseCode = "404", description = "경로를 찾을 수 없음: 등록되지 않은 URL로 요청한 경우입니다.",
                content = @Content),
        @ApiResponse(responseCode = "405", description = "허용되지 않는 메서드: 해당 URL에서 지원하지 않는 HTTP 메서드로 요청한 경우입니다.",
                content = @Content)
})
@RequestMapping("/api/study")
@RestController
public class studyController01 {

    @Operation(summary = "GET 요청 확인", description = "GET 요청을 처리하고 확인 메시지를 반환합니다.")
    @ApiResponse(responseCode = "200", description = "GET 요청 처리 성공",
            content = @Content(mediaType = "text/plain",
                    schema = @Schema(type = "string", example = "겟 확인!!")))
    @GetMapping("/a")
    public String get01() {
        return "겟 확인!!";
    }

    @Operation(summary = "POST 요청 확인", description = "POST 요청을 처리하고 확인 메시지를 반환합니다. 실제 데이터를 생성하지 않습니다.")
    @ApiResponse(responseCode = "200", description = "POST 요청 처리 성공",
            content = @Content(mediaType = "text/plain",
                    schema = @Schema(type = "string", example = "포스트 확인!!")))
    @PostMapping("/b")
    public String post01() {
        return "포스트 확인!!";
    }

    @Operation(summary = "DELETE 요청 확인", description = "DELETE 요청을 처리하고 확인 메시지를 반환합니다. 실제 데이터를 삭제하지 않습니다.")
    @ApiResponse(responseCode = "200", description = "DELETE 요청 처리 성공",
            content = @Content(mediaType = "text/plain",
                    schema = @Schema(type = "string", example = "딜리트 확인!!")))
    @DeleteMapping("/c")
    public String delete01() {
        return "딜리트 확인!!";
    }

    @Operation(summary = "PUT 요청 확인", description = "PUT 요청을 처리하고 확인 메시지를 반환합니다. 실제 데이터를 수정하지 않습니다.")
    @ApiResponse(responseCode = "200", description = "PUT 요청 처리 성공",
            content = @Content(mediaType = "text/plain",
                    schema = @Schema(type = "string", example = "풋 확인!!")))
    @PutMapping("/d")
    public String put01() {
        return "풋 확인!!";
    }
}
