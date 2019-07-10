let months = ["jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"];

let emails = [{
    name: faker.name.findName(),
    subject: faker.random.words(3),
    preview: faker.random.words(6),
    date: faker.date.past()
  },
  {
    name: faker.name.findName(),
    subject: faker.random.words(3),
    preview: faker.random.words(6),
    date: faker.date.past()
  },
  {
    name: faker.name.findName(),
    subject: faker.random.words(3),
    preview: faker.random.words(6),
    date: faker.date.past()
  },
  {
    name: faker.name.findName(),
    subject: faker.random.words(3),
    preview: faker.random.words(6),
    date: faker.date.past()
  },
  {
    name: faker.name.findName(),
    subject: faker.random.words(3),
    preview: faker.random.words(6),
    date: faker.date.past()
  },
  {
    name: faker.name.findName(),
    subject: faker.random.words(3),
    preview: faker.random.words(6),
    date: faker.date.past()
  }
];

let sentEmails = [];

const users = [{
  name: 'Mauricio',
  picture: 'assets/images/users/mauricio.jpeg',
  lastMessage: 'Você: Funfa sim!',

},
{
  name: 'Tejada',
  picture: 'assets/images/users/tejada.png',
  lastMessage: 'Você: Sou backend :P',

},
{
  name: 'Bean',
  picture: 'assets/images/users/bean.jpeg',
  lastMessage: 'Você: Hello XD',
}
]

const emailPreview = document.getElementsByClassName("email-list");

const divContatos = document.getElementById('hangout-talk');

let intervalEmail = window.setInterval(getNewEmail, 15000);

let intervalNewEmail = window.setInterval(getNewEmails, 60000);

let html = '';

users.forEach(user => {
  html += `
      <div class="hangout-talk-profile" onClick='setChat(${JSON.stringify(user)})'>
        <img src=${user.picture} title="User" alt="User" class="profile-photo" />
        <div class="hangout-users-info">
          <p class="profile-name">${user.name}</p>
          <span class="profile-message">${user.lastMessage}</span>
        </div>
      </div>
  `
})
divContatos.innerHTML = html;


$("#square").click(function () {
  if ($(this).attr("src") == "assets/images/icons/check_box_outline_blank_black_20dp.png") {
    $(this).attr("src", "assets/images/icons/mark-check.png");
    $(".square").attr("src", "assets/images/icons/mark-check.png").css("opacity", "1.2");
    $(".tr").css('background', '#c2dbff');
  } else {
    $(this).attr("src", "assets/images/icons/check_box_outline_blank_black_20dp.png");
    $(".square").attr("src", "assets/images/icons/check_box_outline_blank_black_20dp.png").css("opacity", "0.2");
    $(".tr").css('background', '#ffffff');
  }
});

$("a.write-email").click(function () {
  $("section.new-message").removeClass("invisible");
});

$("li.new-message-close").click(function () {
  $("section.new-message").addClass("invisible");
});

$("label.search-email-box").click(function () {
  $(this).addClass("search-email-click");
  $("input.search-email").css("background-color", "white");
});

$("body").click(function (event) {
  if (!$("label.search-email-box").is(event.target) && !$("input.search-email").is(event.target)) {
    $("label.search-email-box").removeClass("search-email-click");
    $("input.search-email").css("background-color", "#f1f3f4");
  }
});

$(".write-email").click(function () {
  $("section.new-message").removeClass("invisible");
});

$(".new-message-close").click(function () {
  $(".new-message").addClass("invisible");
});

$(".search-email-box").click(function () {
  $(this).addClass("search-email-click");
  $(".search-email").css('background-color', 'white');
});

$(".hangout-talk-profile").click(function () {
  $(".talk-hangout").removeClass("invisible");
});

$(".new-message-close").click(function () {
  $(".talk-hangout").addClass("invisible");
});

$("#options").click(function () {
  $(".more-nav-table").toggleClass("invisible");
});

$("#refresh").click(getNewEmails);

$(".send-button").click(function (){
  let newSentEmail = {
      name: $(".recipient").val(),
      subject: $(".subject").val(),
      preview: $(".email-body").val().substring(0, 100),
      date: new Date()
  }
  sentEmails.unshift(newSentEmail);
$(".recipient").val('');
$(".subject").val('');
$(".email-body").val('');
$(".new-message").addClass('invisible');
});

$("li.new-message-minimize").click(function(){
  $("section.new-message").addClass("invisible");
  $("section.minimize-new-message").removeClass("invisible");  
})

$("section.minimize-new-message").click(function(event) {

  if($("li.close-icon").is(event.target)) {
    $("section.minimize-new-message").addClass("invisible");
    $("section.new-message").addClass("invisible");
  }
  else{
    $("section.minimize-new-message").addClass("invisible");
    $("section.new-message").removeClass("invisible");
  }
});

$("#sent-emails").click(getSentEmails);

$('#received-emails').click(getNewEmails);

function setChat(user) {
  $(".talk-hangout-name").text(user.name);
}

function getNewEmail() {
  let newEmail = {
    name: faker.name.findName(),
    subject: faker.random.words(3),
    preview: faker.random.words(6),
    date: new Date()
  };
  emails.push(newEmail);
}

function getNewEmails() {
  let htmlEmails = "";

  emails.sort(function (email1, email2) {
    return new Date(email2.date) - new Date(email1.date);
  });

  emails.forEach(function (email) {
    htmlEmails += `
        <tr class="email-font-size tr">
            <td class="checkbox-column">
              <img src="assets/images/icons/check_box_outline_blank_black_20dp.png" class="square"
                title="Checkbox" alt="checkbox">
            </td> 
            <td class="star-column">
              <img  src="assets/images/icons/star_border_black.png" title="Star"
                alt="star">
            </td>
            <td class="info-column">
            <span class="email-item">${email.name}</span>
          </td>
          <td class="info-column">
            <span class="email-item">${email.subject} - </span>
            <span class="email-item-info">${email.preview} </span>
          </td>
          <td class="info-column">
            <span class="email-item-time">${defineDateString(email.date)}</span>
          </td>
        </tr>`
  });
  emailPreview[0].innerHTML = htmlEmails;
}

function getSentEmails() {
  let htmlSentEmails = "";

  sentEmails.sort(function (email1, email2) {
    return new Date(email2.date) - new Date(email1.date);
  });

  sentEmails.forEach(function (email) {
    htmlSentEmails += `
        <tr class="email-font-size tr">
            <td class="checkbox-column">
              <img src="assets/images/icons/check_box_outline_blank_black_20dp.png" class="square"
                title="Checkbox" alt="checkbox">
            </td> 
            <td class="star-column">
              <img  src="assets/images/icons/star_border_black.png" title="Star"
                alt="star">
            </td>
            <td class="info-column">
            <span class="email-item">Para: ${email.name}</span>
          </td>
          <td class="info-column">
            <span class="email-item">${email.subject} - </span>
            <span class="email-item-info">${email.preview} </span>
          </td>
          <td class="info-column">
            <span class="email-item-time">${defineDateString(email.date)}</span>
          </td>
        </tr>`
  });
  emailPreview[0].innerHTML = htmlSentEmails;
}

function defineDateString(date) {
  let dateNow = new Date();
  let dateParsed = date.getTime();
  const diffTime = Math.abs(dateNow - dateParsed);
  const diffDays = diffTime / (1000 * 60 * 60 * 24);
  if (diffDays < 1) {
    if (date.getMinutes() < 10)
      return `${date.getHours()}:0${date.getMinutes()}`;
    return `${date.getHours()}:${date.getMinutes()}`;
  }
  if (dateNow.getFullYear() == date.getFullYear()) return `${date.getDate()} de ${months[date.getMonth()]}`;
  return `${date.getDate()}/${date.getMonth() +
    1}/${date.getFullYear()}`;
}

getNewEmail();
getNewEmails();