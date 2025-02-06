package LegalDocumentApplication.controller;
import LegalDocumentApplication.entity.CandidateDetails;
import LegalDocumentApplication.service.CandidateDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@RestController
@RequestMapping("/user")
public class CandidateDetailsController {

    @Autowired
    private CandidateDetailsService candidateDetailsService;


    @GetMapping("/profile")
    public String userProfile() {
        return "User Profile";
    }

    @PostMapping("/")
    public ResponseEntity<CandidateDetails> createCandidateDetails(
            @RequestPart("candidateDetails") CandidateDetails candidateDetails,
            @RequestPart("aadharCardFile") MultipartFile aadharCardFile) throws IOException {
        CandidateDetails savedCandidateDetails = candidateDetailsService.saveCandidateDetails(candidateDetails, aadharCardFile);
        return ResponseEntity.ok(savedCandidateDetails);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CandidateDetails> getCandidateDetailsById(@PathVariable("id") int id) {
        CandidateDetails candidateDetails = candidateDetailsService.getCandidateDetailsById(id);
        if (candidateDetails != null) {
            return ResponseEntity.ok(candidateDetails);
        } else {
            return ResponseEntity.notFound().build(); // Return 404 if candidate not found
        }
    }
}
