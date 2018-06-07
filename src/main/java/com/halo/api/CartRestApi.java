package com.halo.api;

import com.google.common.collect.ImmutableMap;
import com.halo.controller.BaseController;
import com.halo.dto.CartItemDTO;
import com.halo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * @author MelloChan
 * @date 2018/6/2
 */
@RestController
@RequestMapping("/api/halo/carts")
@Validated
public class CartRestApi extends BaseController {
    @Autowired
    private CartService cartService;

    @GetMapping("/")
    public Map<String, Object> getCart(@RequestHeader("access_token") String token, HttpServletRequest request) {

        return rtnParam(0, ImmutableMap.of("cart", ""));
    }

    @PostMapping("/")
    public Map<String, Object> insertCartItem(@Valid @RequestBody CartItemDTO cartItemDTO,
                                              HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        System.out.println(cartItemDTO);
        response.addCookie(cartService.insertCartItem(request.getHeader("access_token"), cartItemDTO, request));
        return rtnParam(0, ImmutableMap.of("msg", "success"));
    }

    @DeleteMapping("/")
    public Map<String, Object> deleteCartItem(@RequestHeader("access_token") String token) {
        return rtnParam(40018, null);
    }

    @PatchMapping("/")
    public Map<String, Object> updateCartItem(@RequestHeader("access_token") String token) {
        return rtnParam(40018, null);
    }
}
