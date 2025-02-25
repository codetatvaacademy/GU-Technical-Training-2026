import React, { useState } from "react";
const DarkModeToggle = () => {
  const [dark, setDark] = useState(false);
  const toggle = () => {
    setDark(!dark);
    document.body.classList.toggle("dark-mode");
  };
  return <button id="dark-mode-toggle" onClick={toggle}>{dark ? "☀ Light Mode" : "🌙 Dark Mode"}</button>;
};
export default DarkModeToggle;