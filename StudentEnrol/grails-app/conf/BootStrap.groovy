import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->

def course1= new Course( title: 'Interactive Media with Animation',
department: 'Computing',
description: ''' Lorem ipsum dolor sit amet, ad sea solum 
brute sensibus, te summo senserit vix, mel reque corpora vulputate ei.''',
leader: 'Joe Jojo',
code: 'IMA101',
startDate: new Date('19/01/2015'),
endDate: new Date('19/01/2020'))
if(!course1.save()) {
course1.errors.allErrors.each{ error ->
println "An error occurred whilst creating course1: ${error}"
}
}
def course2= new Course( title: 'Digital Technologies',
department: 'Computing',
description: ''' Lorems ipsum dolor sit amet, ad sea solum 
brute sensibus, te summor senserit vix, mel reque corpora vulputate eit.''',
leader: 'Joe Jojo',
code: 'IMA102',
startDate: new Date('19/01/2015'),
endDate: new Date('19/01/2020'))
if(!course2.save()) {
course2.errors.allErrors.each{ error ->
println "An error occurred whilst creating course2: ${error}"
}
}

    }
    def destroy = {
    }
}
