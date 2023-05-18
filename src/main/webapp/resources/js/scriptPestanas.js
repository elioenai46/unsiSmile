

const tabs = document.querySelectorAll('.tab');
const tabPanes = document.querySelectorAll('.tab-pane');
const prevTabButton = document.querySelector('.prev-tab-button');
const nextTabButton = document.querySelector('.next-tab-button');
const accordionItems = document.querySelectorAll('.accordion-item');
const accordionHeaders = document.querySelectorAll('.accordion-header');

let activeTabIndex = 0;

tabs.forEach((tab, index) => {
  tab.addEventListener('click', () => {
    if (activeTabIndex !== index) {
      tabs[activeTabIndex].classList.remove('active');
      tab.classList.add('active');
      tabPanes[activeTabIndex].classList.remove('active');
      tabPanes[index].classList.add('active');
      activeTabIndex = index;
    }
  });
});

prevTabButton.addEventListener('click', () => {
  if (activeTabIndex > 0) {
    tabs[activeTabIndex].classList.remove('active');
    tabPanes[activeTabIndex].classList.remove('active');
    activeTabIndex--;
    tabs[activeTabIndex].classList.add('active');
    tabPanes[activeTabIndex].classList.add('active');
  }
});

nextTabButton.addEventListener('click', () => {
  if (activeTabIndex < tabs.length - 1) {
    tabs[activeTabIndex].classList.remove('active');
    tabPanes[activeTabIndex].classList.remove('active');
    activeTabIndex++;
    tabs[activeTabIndex].classList.add('active');
    tabPanes[activeTabIndex].classList.add('active');
  }
});

accordionHeaders.forEach((header) => {
  header.addEventListener('click', () => {
    const accordionItem = header.parentNode;
    const accordionContent = accordionItem.querySelector('.accordion-content');
    if (accordionItem.classList.contains('active')) {
      accordionItem.classList.remove('active');
      accordionContent.style.maxHeight = null;
    } else {
      accordionItems.forEach((item) => {
        item.classList.remove('active');
        item.querySelector('.accordion-content').style.maxHeight = null;
      });
      accordionItem.classList.add('active');
      accordionContent.style.maxHeight = accordionContent.scrollHeight + 'px';
    }
  });
});
