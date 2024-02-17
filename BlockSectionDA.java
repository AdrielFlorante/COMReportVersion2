import java.io.*;
import java.util.*;

public class BlockSectionDA {
    private List<BlockSection> blockSectionList;

    //set getters
    public List<BlockSection> getBlockSectionList(){
        return blockSectionList;
    }
    
    
    //constructors to gather data
    public BlockSectionDA() throws FileNotFoundException {

        blockSectionList = new ArrayList<>();

        Scanner blockFile = new Scanner(new FileReader("blockSection.csv"));

        /*
         * Scanner blockFile opens file and reads it line by line
         * and adds it to the blockSectionList
         */
        while (blockFile.hasNext()) {
            //create blockSection
            BlockSection blockSection = new BlockSection();

            String blockSectionRaw = blockFile.nextLine();
            String[] blockSectionArray = new String[3];
            blockSectionArray = blockSectionRaw.split(",");

            //set values for blockSection
            blockSection.setBlockCode(blockSectionArray[0].trim());
            blockSection.setDescription(blockSectionArray[1].trim());
            blockSection.setAdviser(blockSectionArray[2].trim());

            // create studentDA
            StudentDA studentDA = new StudentDA(blockSection.getBlockCode());
            
            // setStudentList
            blockSection.setStudentList(studentDA.getStudentList());

            blockSectionList.add(blockSection);

            // setTotalStudents
            blockSection.setTotalStudents(studentDA.getStudentList().size());

        }

        blockFile.close();
        
    }

}