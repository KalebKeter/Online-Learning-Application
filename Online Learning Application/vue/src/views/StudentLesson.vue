<template>

  <div class="student-lesson">
    <h1>Student Dashboard</h1>
<div class="readingcontainer">
    <h2> Lesson 1: AI vs AI In Education </h2>

    <p> Artificial intelligence (AI) has transformed many industries, including education. One of the ways AI is being used in education is through essay grading. Automated essay scoring (AES) is a process that uses algorithms to grade student essays based on various criteria, such as grammar, organization, and vocabulary. However, with the rise of AI in education, some people may wonder how to detect whether AI is being used when writing an essay.

<p> To answer this question, it's important to understand how AI works in essay grading. AI-based essay grading systems use natural language processing (NLP) algorithms to analyze essays and provide feedback. NLP algorithms are designed to detect patterns in language and understand the meaning behind words and sentences. </p>

<p>While AI grading systems are becoming increasingly sophisticated, there are still some telltale signs that an essay has been written by a human or a machine. One of the most obvious signs is the presence of errors that are commonly made by AI systems. For example, AI systems may struggle with idiomatic expressions, metaphors, and other nuanced forms of language. As a result, essays that are riddled with errors in these areas may be flagged as having been written by an AI system.</p>

<p> Another way to detect whether an essay has been written by an AI system is to look at the overall structure and organization of the essay. AI systems tend to follow a specific structure and format that is consistent across all essays. This means that essays that deviate from this structure may be flagged as having been written by a human. </p>

<p>Finally, AI-based essay grading systems are also designed to detect plagiarism. While humans may also be able to detect plagiarism, AI systems are able to analyze large amounts of text quickly and efficiently. This means that essays that contain large amounts of text that is similar to other sources may be flagged as having been plagiarized. </p>

<p>In conclusion, while AI-based essay grading systems are becoming increasingly sophisticated, there are still ways to detect whether an essay has been written by a human or a machine. By looking for errors in language, deviations in structure, and instances of plagiarism, educators can ensure that student essays are being graded fairly and accurately.</p>
</div>
<div id="hw">
<h2> Homework Assignment </h2>
 <form>
        <h3>What are some potential drawbacks to using AI to grade essays?</h3>
        <div class="form-input-group">
          <label for="name">Answer: </label>
          <input
            type="text"
            id="hw"
            required
            autofocus
          />
        </div>
    <router-link :to="{ name: 'submitted' }">
  <button type="submit">Submit</button>
</router-link>
  </form>
</div>
</div>

  
</template>




<style scoped>

.readingcontainer {
  background-color:black;
  margin-bottom: 20px;
  padding: 10px;

}

#hw {
  background-color:black;
  margin-bottom: 20px;
  padding: 10px;
  
}
#hw label {
font-size: 20px
}

input[type=text] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  color: greenyellow;
  border-color: white;
  border-radius: 10px;
  border-width: 3px;
}

#hw button {
  margin-top: -4px;
  width: 150px;
  height: 30px;
  background-color: greenyellow;
  border-color: black;
  font-weight: 900; 
}

#hw button:hover {
background-color: black;
color: greenyellow;
}

</style>