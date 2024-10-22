package com.clauselocator.clauselocator;

import org.springframework.stereotype.Service;

import com.clauselocator.clauselocator.resposne.TextSearchResponse;

@Service
public class TextSearchService {

    public TextSearchResponse findTextIndices(String text, String paragraph) {
        int startIdx = paragraph.indexOf(text);
        if (startIdx == -1) {
            return new TextSearchResponse(-1, -1, getFailMessage());
        }
        int endIdx = startIdx + text.length() - 1;
        return new TextSearchResponse(startIdx, endIdx, "Text found successfully.");
    }

    private String getFailMessage() {
        return "Text not found in the paragraph.";
    }

    private String getSuccessMessage() {
        
    }
}
