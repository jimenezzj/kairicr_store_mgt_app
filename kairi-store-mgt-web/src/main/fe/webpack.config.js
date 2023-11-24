const path = require('path');

console.log(path.join(__dirname, "pages", "customers", "index.js"));

module.exports = {
    mode: "production",
    entry: {
        customers: path.join(__dirname, "pages", "customers", "index.js"),
        globals: path.join(__dirname, "pages", "global.js"),
    },
    output: {
        filename: "[name]-bundle.js",
        path: path.join(__dirname, "..", "resources", "static", "dist"),
        clean: true
    },
    module: {
        rules: [
            {
                test: /\.css$/,
                use: [
                    {loader: "style-loader"},
                    {
                        loader: "css-loader",
                        options: {
                            sourceMap: true // TODO: this could be changed to be development only
                        }
                    },
                    {loader: "postcss-loader"}
                ]
            }
        ]
    }
}