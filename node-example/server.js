const express = require("express");
const port = process.env.PORT || 8080;
const path = require("path");
const app = express();
const pino = require("pino-http")();

app.use(pino);
app.use(express.static(path.join(__dirname, "public")));

app.get("/", (req, res) => {
  res.sendFile(path.join(__dirname, "public", "index.html"));
});

app.get("/actuator/health/liveness", (req, res) => {
  res.json({ status: "UP" });
});

app.get("/actuator/health/readiness", (req, res) => {
  res.json({ status: "UP" });
});

app.listen(port, () => {
  console.log(`App listening on port ${port}`);
});
