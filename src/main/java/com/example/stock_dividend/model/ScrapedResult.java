package com.example.stock_dividend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class ScrapedResult {

    private Company company;

    private List<Dividend> dividendsEntities;

    public ScrapedResult() {
        this.dividendsEntities = new ArrayList<>();
    }

}
