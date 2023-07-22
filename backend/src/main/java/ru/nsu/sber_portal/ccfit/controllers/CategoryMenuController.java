package ru.nsu.sber_portal.ccfit.controllers;

import io.swagger.annotations.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.web.bind.annotation.*;
import ru.nsu.sber_portal.ccfit.models.entity.*;
import ru.nsu.sber_portal.ccfit.services.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(produces = "application/json")
@RequiredArgsConstructor
@Slf4j
@RestController
@Api("Controller for category menu")
public class CategoryMenuController {

    private final CategoryMenuService categoryMenuService;

    @ApiOperation("Category menu view")
    @GetMapping("/{titleRest}/category/{id}")
    public List<Dish> viewDishByCategory(@PathVariable String titleRest, @PathVariable Long id) {
        log.info("View dish by category,  rest: " + titleRest);
        return categoryMenuService.getListDishByCategory(id);
    }
}