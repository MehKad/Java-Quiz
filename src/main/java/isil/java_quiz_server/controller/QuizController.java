package isil.java_quiz_server.controller;

import isil.java_quiz_server.modal.Quiz;
import isil.java_quiz_server.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
public class QuizController {

    @Autowired
    private QuizRepository quizRepository;

    @GetMapping("/quizzes")
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    @PostMapping("/quizzes")
    public Quiz createQuiz(@RequestBody Quiz quiz) {
        return quizRepository.save(quiz);
    }
    @GetMapping("/quizzes/{id}")
    public ResponseEntity<Quiz> getQuizById(@PathVariable Long id) {
        Optional<Quiz> quizOptional = quizRepository.findById(id);

        return quizOptional
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
