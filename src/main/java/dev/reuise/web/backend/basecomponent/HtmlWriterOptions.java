package dev.reuise.web.backend.basecomponent;

public class HtmlWriterOptions {
    public static class HtmlWriterStartTagOptions {
        private String tagName;
        private boolean close;
        private boolean writeStyleSheets = true;

        public HtmlWriterStartTagOptions() {
        }

        public String getTagName() {
            return tagName;
        }
        
        public HtmlWriterStartTagOptions setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }

        public boolean isClose() {
            return close;
        }

        public HtmlWriterStartTagOptions setClose(boolean close) {
            this.close = close;
            return this;
        }

        public boolean isWriteStyleSheets() {
            return writeStyleSheets;
        }

        public HtmlWriterStartTagOptions setWriteStyleSheets(boolean writeStyleSheets) {
            this.writeStyleSheets = writeStyleSheets;
            return this;
        }
    }  
}
