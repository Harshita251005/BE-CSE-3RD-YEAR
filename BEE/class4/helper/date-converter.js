function formatDate(date) {
  return new Date(date).toISOString(); // Example: 2025-08-21T10:30:00.000Z
}

function dateConverter(date) {
  return new Date(date).toLocaleTimeString(); // Example: 4:00:30 PM
}

module.exports = { formatDate, dateConverter };
