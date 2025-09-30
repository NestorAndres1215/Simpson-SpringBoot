package com.example.simpson_api.service;

import com.example.simpson_api.model.Personaje;

import java.util.List;

public class ApiResponse {
    private List<Personaje> docs;
    private int totalDocs;
    private int limit;
    private int totalPages;
    private int page;
    private int pagingCounter;
    private boolean hasPrevPage;
    private boolean hasNextPage;
    private Integer prevPage;
    private Integer nextPage;

    // Getters y setters
    public List<Personaje> getDocs() { return docs; }
    public void setDocs(List<Personaje> docs) { this.docs = docs; }

    public int getTotalDocs() { return totalDocs; }
    public void setTotalDocs(int totalDocs) { this.totalDocs = totalDocs; }

    public int getLimit() { return limit; }
    public void setLimit(int limit) { this.limit = limit; }

    public int getTotalPages() { return totalPages; }
    public void setTotalPages(int totalPages) { this.totalPages = totalPages; }

    public int getPage() { return page; }
    public void setPage(int page) { this.page = page; }

    public int getPagingCounter() { return pagingCounter; }
    public void setPagingCounter(int pagingCounter) { this.pagingCounter = pagingCounter; }

    public boolean isHasPrevPage() { return hasPrevPage; }
    public void setHasPrevPage(boolean hasPrevPage) { this.hasPrevPage = hasPrevPage; }

    public boolean isHasNextPage() { return hasNextPage; }
    public void setHasNextPage(boolean hasNextPage) { this.hasNextPage = hasNextPage; }

    public Integer getPrevPage() { return prevPage; }
    public void setPrevPage(Integer prevPage) { this.prevPage = prevPage; }

    public Integer getNextPage() { return nextPage; }
    public void setNextPage(Integer nextPage) { this.nextPage = nextPage; }
}